package clases;

public class Proveedor {
    private int id_prov;
    private String ruc_prov;
    private String telefono_prov;
    private String pais_prov;
    private String correo_prov;
    private String moneda_prov;

    public Proveedor() {
    }

    public Proveedor(int id_prov, String ruc_prov, String telefono_prov, String pais_prov, String correo_prov, String moneda_prov) {
        this.id_prov = id_prov;
        this.ruc_prov = ruc_prov;
        this.telefono_prov = telefono_prov;
        this.pais_prov = pais_prov;
        this.correo_prov = correo_prov;
        this.moneda_prov = moneda_prov;
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public String getRuc_prov() {
        return ruc_prov;
    }

    public void setRuc_prov(String ruc_prov) {
        this.ruc_prov = ruc_prov;
    }

    public String getTelefono_prov() {
        return telefono_prov;
    }

    public void setTelefono_prov(String telefono_prov) {
        this.telefono_prov = telefono_prov;
    }

    public String getPais_prov() {
        return pais_prov;
    }

    public void setPais_prov(String pais_prov) {
        this.pais_prov = pais_prov;
    }

    public String getCorreo_prov() {
        return correo_prov;
    }

    public void setCorreo_prov(String correo_prov) {
        this.correo_prov = correo_prov;
    }

    public String getMoneda_prov() {
        return moneda_prov;
    }

    public void setMoneda_prov(String moneda_prov) {
        this.moneda_prov = moneda_prov;
    }
        
    
    
}
