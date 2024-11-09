package clases;

public class RolCompetencia {
    private Rol fk_id_rol;
    private Competencia fk_id_com;

    public RolCompetencia() {
    }

    public RolCompetencia(Rol fk_id_rol, Competencia fk_id_com) {
        this.fk_id_rol = fk_id_rol;
        this.fk_id_com = fk_id_com;
    }

    public Rol getFk_id_rol() {
        return fk_id_rol;
    }

    public void setFk_id_rol(Rol fk_id_rol) {
        this.fk_id_rol = fk_id_rol;
    }

    public Competencia getFk_id_com() {
        return fk_id_com;
    }

    public void setFk_id_com(Competencia fk_id_com) {
        this.fk_id_com = fk_id_com;
    }

    
    
}
