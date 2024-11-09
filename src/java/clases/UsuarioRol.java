package clases;

public class UsuarioRol {
    private Usuario fk_id_usuario;
    private Rol fk_id_rol;

    public UsuarioRol() {
    }

    public UsuarioRol(Usuario fk_id_usuario, Rol fk_id_rol) {
        this.fk_id_usuario = fk_id_usuario;
        this.fk_id_rol = fk_id_rol;
    }

    public Usuario getFk_id_usuario() {
        return fk_id_usuario;
    }

    public void setFk_id_usuario(Usuario fk_id_usuario) {
        this.fk_id_usuario = fk_id_usuario;
    }

    public Rol getFk_id_rol() {
        return fk_id_rol;
    }

    public void setFk_id_rol(Rol fk_id_rol) {
        this.fk_id_rol = fk_id_rol;
    }

    
    
}
