/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import clases.Competencia;
import clases.Persona;
import clases.Rol;
import clases.RolCompetencia;
import clases.Usuario;
import clases.UsuarioRol;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author migue
 */
public class database {
    public static List<RolCompetencia> rolcompetencia = new ArrayList<>();
    public static List<UsuarioRol> usuarioRol = new ArrayList<>();
    public static List<Usuario> usuarios = new ArrayList<>();
    
    public static void cargarDatos() {
        
        if (!(rolcompetencia.isEmpty() && usuarioRol.isEmpty() && usuarios.isEmpty())) return;
        
        Persona persona1 = new Persona(1, "Miguel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona2 = new Persona(2, "Angel", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        Persona persona3 = new Persona(3, "Riofrio", "Zhunio", "1234567890", "0967844996", "miguelzhunio328@gmail.com");
        
        Usuario usuario1 = new Usuario(1, persona1, "zhunio", "1234");
        Usuario usuario2 = new Usuario(2, persona2, "angel", "1234");
        Usuario usuario3 = new Usuario(3, persona3, "rio", "1234");
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        
        Competencia c1 = new Competencia(1, "CREAR", "Crear productos");
        Competencia c2 = new Competencia(2, "EDITAR", "Editar productos");
        Competencia c3 = new Competencia(3, "ELIMINAR", "eliminar productos");
        Competencia c4 = new Competencia(4, "VISUALIZAR", "leer productos");
    
        
        Rol administrador = new Rol(1, "ADMINISTRADOR", true);
        rolcompetencia.add(new RolCompetencia(administrador, c1));
        rolcompetencia.add(new RolCompetencia(administrador, c2));
        rolcompetencia.add(new RolCompetencia(administrador, c3));
        rolcompetencia.add(new RolCompetencia(administrador, c4));
        
        Rol gerente = new Rol(2, "Gerente", true);
        rolcompetencia.add(new RolCompetencia(gerente, c2));
        rolcompetencia.add(new RolCompetencia(gerente, c4));
        
        Rol cajera = new Rol(3, "Cajera", true);
        rolcompetencia.add(new RolCompetencia(cajera, c4));
        
        usuarioRol.add(new UsuarioRol(usuario1, administrador));
        usuarioRol.add(new UsuarioRol(usuario2, gerente));
        usuarioRol.add(new UsuarioRol(usuario3, cajera)); 
        
        System.out.println("Datos ingresados" + usuarios.size());
    }
    
    public static List<Competencia> encontrarCompetencias(Usuario u) {
        List<Competencia> competencias = new ArrayList<>();
        usuarioRol.stream().filter(ur -> (ur.getFk_id_usuario().getId_usu() == u.getId_usu())).forEachOrdered(ur -> {
            rolcompetencia.stream().filter(r -> (r.getFk_id_rol().getId_rol() == ur.getFk_id_rol().getId_rol())).forEachOrdered(r -> {
                competencias.add(r.getFk_id_com());
            });
        });
        return competencias;
    }
    
    public static Usuario encontrarUsuario(String user, String password) {
        for (Usuario u: usuarios) {
            if (u.getUsuario_usu().equals(user) && u.getPassword_usu().equals(password)) {
                return u;
            }
        }
        return null;
    }
   
}
