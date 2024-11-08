package clases;

public class Rol {
    private String id_rol;
    private String nombre_rol;
    private boolean estado_rol;

    public Rol() {
    }

    public Rol(String id_rol, String nombre_rol, boolean estado_rol) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.estado_rol = estado_rol;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
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
}
