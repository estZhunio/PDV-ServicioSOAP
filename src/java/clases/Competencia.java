package clases;

public class Competencia {
    private int id_com;
    private String nombre_com;
    private String descripcion_com;

    public Competencia() {
    }

    public Competencia(int id_com, String nombre_com, String descripcion_com) {
        this.id_com = id_com;
        this.nombre_com = nombre_com;
        this.descripcion_com = descripcion_com;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    public String getNombre_com() {
        return nombre_com;
    }

    public void setNombre_com(String nombre_com) {
        this.nombre_com = nombre_com;
    }

    public String getDescripcion_com() {
        return descripcion_com;
    }

    public void setDescripcion_com(String descripcion_com) {
        this.descripcion_com = descripcion_com;
    }

    public boolean siExisiteCom(String id_com) {
        return false;
    }
    
}
