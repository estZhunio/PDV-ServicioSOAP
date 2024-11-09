/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import clases.Competencia;
import clases.Persona;
import clases.Rol;
import clases.RolCompetencia;
import clases.Usuario;
import clases.UsuarioRol;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author migue
 */
@WebService(serviceName = "ManipulacionDeDatos")
public class ManipulacionDeDatos {
    List<RolCompetencia> rolcompetencia = new ArrayList<>();
    List<UsuarioRol> usuarioRol = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    
    @WebMethod(operationName = "hello")
    public String insertarDatos(@WebParam(name = "name") String txt) {
        
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "login")
    public List<Competencia> login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        cargarDatos();
        for (Usuario u: usuarios) {
            if (u.getUsuario_usu().equals(usuario) && u.getPassword_usu().equals(password)) {
                return encontrarCompetencias(u);
            }
        }
        
        return null;
    }
    
    public List<Competencia> encontrarCompetencias(Usuario u) {
        List<Competencia> competencias = new ArrayList<>();
        for (UsuarioRol ur: usuarioRol) {
            if (ur.getFk_id_usuario() == u) {
                
                for(RolCompetencia r: rolcompetencia) {
                    if (r.getFk_id_rol() == ur.getFk_id_rol()) {
                        competencias.add(r.getFk_id_com());
                    }
                }
            }
        }
        return competencias;
    }
    
    public void cargarDatos() {
        Persona persona1 = new Persona(1, "Miguel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona2 = new Persona(2, "Angel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona3 = new Persona(3, "Riofrio", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        
        Usuario usuario1 = new Usuario(1, persona1, "zhunio", "1234");
        Usuario usuario2 = new Usuario(1, persona2, "angel", "1234");
        Usuario usuario3 = new Usuario(1, persona3, "rio", "1234");
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        
        Competencia c1 = new Competencia(1, "CREAR", "Crear productos");
        Competencia c2 = new Competencia(1, "EDITAR", "Editar productos");
        Competencia c3 = new Competencia(1, "ELIMINAR", "eliminar productos");
        Competencia c4 = new Competencia(1, "VISUALIZAR", "leer productos");
    
        
        Rol administrador = new Rol(1, "ADMINISTRADOR", true);
        rolcompetencia.add(new RolCompetencia(administrador, c1));
        rolcompetencia.add(new RolCompetencia(administrador, c2));
        rolcompetencia.add(new RolCompetencia(administrador, c3));
        rolcompetencia.add(new RolCompetencia(administrador, c4));
        
        Rol gerente = new Rol(1, "Gerente", true);
        rolcompetencia.add(new RolCompetencia(gerente, c2));
        rolcompetencia.add(new RolCompetencia(gerente, c4));
        
        Rol cajera = new Rol(1, "Cajera", true);
        rolcompetencia.add(new RolCompetencia(cajera, c4));
        
        usuarioRol.add(new UsuarioRol(usuario1, administrador));
        usuarioRol.add(new UsuarioRol(usuario2, gerente));
        usuarioRol.add(new UsuarioRol(usuario1, cajera));  
    }
}
