package ws;

import clases.Clasificacion;
import clases.Competencia;
import clases.Factura;
import clases.ItemFactura;
import clases.Persona;
import clases.Producto;
import clases.Proveedor;
import clases.Rol;
import clases.RolCompetencia;
import clases.TipoPago;
import clases.Usuario;
import clases.UsuarioRol;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebParam;

@WebService(serviceName = "ManipulacionDeDatos")
public class ManipulacionDeDatos {

    public ArrayList<Usuario> usuarios = new ArrayList<>();
    public ArrayList<Factura> facturas = new ArrayList<>();
    public ArrayList<Persona> personas = new ArrayList<>();

    @WebMethod(operationName = "login")
    public List<Competencia> login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        List<Competencia> competencias = new ArrayList<>();
        cargarDatos();

        Usuario u = encontrarUsuario(usuario, password);

        if (u != null) {
            for (UsuarioRol ur : u.getListaRoles()) {
                Rol rol = ur.getFk_id_rol();
                for (RolCompetencia rc : rol.getListaCompetencias()) {
                    competencias.add(rc.getFk_id_com());
                }
            }
            return competencias;
        } else {
            return null;
        }   

    }
    
    @WebMethod(operationName = "consultarCedula")
    public List<Factura> consultarCedula(@WebParam(name = "cedula") String cedula) {
        List<Factura> facturas = new ArrayList<>();
        cargarDatos();

        Persona p = encontrarPersona(cedula);
        
        if (p != null) {
            facturas = encontrarFactura(p);
        } 
        return facturas;
  

    }

    public void cargarDatos() {

        if (!usuarios.isEmpty()) {
            return;
        }

        Competencia c1 = new Competencia(1, "CREAR", "Crear productos");
        Competencia c2 = new Competencia(2, "EDITAR", "Editar productos");
        Competencia c3 = new Competencia(3, "ELIMINAR", "eliminar productos");
        Competencia c4 = new Competencia(4, "VISUALIZAR", "leer productos");

        Rol rol1 = new Rol(1, "ADMINISTRADOR", true);
        ArrayList<RolCompetencia> rolcompetencia1 = new ArrayList<>();
        rolcompetencia1.add(new RolCompetencia(rol1, c1));
        rolcompetencia1.add(new RolCompetencia(rol1, c2));
        rolcompetencia1.add(new RolCompetencia(rol1, c3));
        rolcompetencia1.add(new RolCompetencia(rol1, c4));
        rol1.setListaCompetencias(rolcompetencia1);

        Rol rol2 = new Rol(2, "Gerente", true);
        ArrayList<RolCompetencia> rolcompetencia2 = new ArrayList<>();
        rolcompetencia2.add(new RolCompetencia(rol2, c2));
        rolcompetencia2.add(new RolCompetencia(rol2, c4));
        rol2.setListaCompetencias(rolcompetencia2);

        Rol rol3 = new Rol(3, "Cajera", true);
        ArrayList<RolCompetencia> rolcompetencia3 = new ArrayList<>();
        rolcompetencia3.add(new RolCompetencia(rol3, c4));
        rol3.setListaCompetencias(rolcompetencia3);

        Persona persona1 = new Persona(1, "Miguel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona2 = new Persona(2, "Angel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona3 = new Persona(3, "Riofrio", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        
        Usuario usuario1 = new Usuario(1, persona1, "zhunio", "1234");
        ArrayList<UsuarioRol> listaRoles1 = new ArrayList<>();
        listaRoles1.add(new UsuarioRol(usuario1, rol1));
        usuario1.setListaRoles(listaRoles1);

        Usuario usuario2 = new Usuario(2, persona2, "angel", "1234");
        ArrayList<UsuarioRol> listaRoles2 = new ArrayList<>();
        listaRoles2.add(new UsuarioRol(usuario2, rol2));
        usuario2.setListaRoles(listaRoles2);

        Usuario usuario3 = new Usuario(3, persona3, "rio", "1234");
        ArrayList<UsuarioRol> listaRoles3 = new ArrayList<>();
        listaRoles3.add(new UsuarioRol(usuario3, rol3));
        usuario3.setListaRoles(listaRoles3);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        
        Proveedor prov1 = new Proveedor(1, "1234567890", "0967844996", "Ecuador", "proveedor@mail.com", "USD");
        Clasificacion clas1 = new Clasificacion(1, "Electrónica");
        Producto producto1 = new Producto(1, 10, 100.0, "unidad", clas1, prov1, true);
        TipoPago tipoPago = new TipoPago(1, "Tarjeta de Crédito", "Efectivo");

         // Crear factura y sus items
        Factura factura1 = new Factura(1, "1234567890", usuario1.getFk_id_per(), new Date(), tipoPago, 10.0, 200.0, new ArrayList<>());
        ItemFactura itemFact1 = new ItemFactura(1, factura1, producto1, 2, 100.0, 200.0);
        
        factura1.getFacturas().add(itemFact1);
        facturas.add(factura1);

    }

    public Usuario encontrarUsuario(String user, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario_usu().equals(user) && u.getPassword_usu().equals(password)) {
                return u;
            }
        }
        return null;
    }
    
    public Persona encontrarPersona(String cedula) {
        for (Persona p : personas) {
            if (p.getDni_per().equals(cedula)) {
                return p;
            }
        }
        return null;
    }
    
    public List<Factura> encontrarFactura(Persona p) {
        ArrayList<Factura> facturasEncontradas = new ArrayList<>();
        
        for (Factura factura: facturas) {
            if (factura.getFk_id_per().getDni_per().equals(p.getDni_per())) {
                facturasEncontradas.add(factura);
            }
        }
    
        
        return facturasEncontradas;
    }

    public static void main(String[] args) {
        ManipulacionDeDatos servicio = new ManipulacionDeDatos();
        /* Usuario u = servicio.login("zhunio", "1234");
        for(UsuarioRol ur: u.getListaRoles()) {
            Rol rol = ur.getFk_id_rol();
            for (RolCompetencia rc: rol.getListaCompetencias()) {
                System.out.println("El usuario encontrado es ---> " + rc.getFk_id_com().getNombre_com());
            }
        }*/

    }

}
