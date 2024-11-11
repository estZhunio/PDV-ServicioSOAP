package ws;

import clases.Competencia;

import clases.Usuario;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import static db.database.cargarDatos;
import static db.database.encontrarCompetencias;
import static db.database.encontrarUsuario;

import javax.jws.WebParam;

@WebService(serviceName = "ManipulacionDeDatos")
public class ManipulacionDeDatos {
    
    @WebMethod(operationName = "login")
    public List<Competencia> login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        cargarDatos();
        
        Usuario usuarioEncontrado = encontrarUsuario(usuario, password);
        
        if (usuarioEncontrado != null) return encontrarCompetencias(usuarioEncontrado);
        
        return null;
    }
     
}
