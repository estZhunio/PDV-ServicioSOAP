package clases;

public class Persona {
    private int id_per;
    private String nombre_per;
    private String apellido_per;
    private String dni_per;
    private String celular_per;
    private String coreo_per;

    public Persona() {
    }

    public Persona(int id_per, String nombre_per, String apellido_per, String dni_per, String celular_per, String coreo_per) {
        this.id_per = id_per;
        this.nombre_per = nombre_per;
        this.apellido_per = apellido_per;
        this.dni_per = dni_per;
        this.celular_per = celular_per;
        this.coreo_per = coreo_per;
    }

    public int getId_per() {
        return id_per;
    }

    public void setId_per(int id_per) {
        this.id_per = id_per;
    }

    public String getNombre_per() {
        return nombre_per;
    }

    public void setNombre_per(String nombre_per) {
        this.nombre_per = nombre_per;
    }

    public String getApellido_per() {
        return apellido_per;
    }

    public void setApellido_per(String apellido_per) {
        this.apellido_per = apellido_per;
    }

    public String getDni_per() {
        return dni_per;
    }

    public void setDni_per(String dni_per) {
        this.dni_per = dni_per;
    }

    public String getCelular_per() {
        return celular_per;
    }

    public void setCelular_per(String celular_per) {
        this.celular_per = celular_per;
    }

    public String getCoreo_per() {
        return coreo_per;
    }

    public void setCoreo_per(String coreo_per) {
        this.coreo_per = coreo_per;
    }
    
    
    public Persona buscarP(String dni_per) {
        return null;
    }
    
    public String nombreCompl(String dni_per) {
        return nombre_per + " " + apellido_per;
    }
    
}
