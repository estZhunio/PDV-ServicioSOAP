package clases;


public class Clasificacion {
    private int id_cla;
    private String grupo_cla;

    public Clasificacion() {
    }

    public Clasificacion(int id_cla, String grupo_cla) {
        this.id_cla = id_cla;
        this.grupo_cla = grupo_cla;
    }

    
    public int getId_cla() {
        return id_cla;
    }

    public void setId_cla(int id_cla) {
        this.id_cla = id_cla;
    }

    public String getGrupo_cla() {
        return grupo_cla;
    }

    public void setGrupo_cla(String grupo_cla) {
        this.grupo_cla = grupo_cla;
    }
    
}
