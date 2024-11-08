package clases;

public class RolCompetencia {
    private int fk_id_rol;
    private int fk_id_com;

    public RolCompetencia() {
    }

    public RolCompetencia(int fk_id_rol, int fk_id_com) {
        this.fk_id_rol = fk_id_rol;
        this.fk_id_com = fk_id_com;
    }

    public int getFk_id_rol() {
        return fk_id_rol;
    }

    public void setFk_id_rol(int fk_id_rol) {
        this.fk_id_rol = fk_id_rol;
    }

    public int getFk_id_com() {
        return fk_id_com;
    }

    public void setFk_id_com(int fk_id_com) {
        this.fk_id_com = fk_id_com;
    }
    
}
