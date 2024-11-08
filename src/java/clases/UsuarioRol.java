package clases;

public class UsuarioRol {
    private int fk_id_usuario;
    private int fk_id_rol;

    public UsuarioRol() {
    }

    public UsuarioRol(int fk_id_usuario, int fk_id_rol) {
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_rol = fk_id_rol;
    }

    public int getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(int fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }

    public int getFk_id_rol() {
        return fk_id_rol;
    }

    public void setFk_id_rol(int fk_id_rol) {
        this.fk_id_rol = fk_id_rol;
    }   
    
}
