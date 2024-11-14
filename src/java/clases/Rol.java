package clases;

import java.util.ArrayList;
import java.util.List;

public class Rol {
    private int id_rol;
    private String nombre_rol;
    private boolean estado_rol;
    private List<RolCompetencia> listaCompetencias; 

    public Rol() {
        this.listaCompetencias = new ArrayList<>();
    }

    public Rol(int id_rol, String nombre_rol, boolean estado_rol) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.estado_rol = estado_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public boolean isEstado_rol() {
        return estado_rol;
    }

    public void setEstado_rol(boolean estado_rol) {
        this.estado_rol = estado_rol;
    }
    
    public boolean siExisteRol(String nombre_rol) {
        return false;
    }
    
    public boolean estado(String nombre_rol) {
        return false;
    }

    public List<RolCompetencia> getListaCompetencias() {
        return listaCompetencias;
    }

    public void setListaCompetencias(List<RolCompetencia> listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }
    
    public void setListaCompetencias(ArrayList<RolCompetencia> listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }
    
    
}
