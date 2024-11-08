package clases;

import java.util.Date;

public class Factura {
    private int id_fac;
    private String ruc_fac;
    private int fk_id_per;
    private Date fecha_fac;
    private int fk_id_pag;
    private double descuento_fac;
    private double total_fac;

    public Factura() {
    }

    public Factura(int id_fac, String ruc_fac, int fk_id_per, Date fecha_fac, int fk_id_pag, double descuento_fac, double total_fac) {
        this.id_fac = id_fac;
        this.ruc_fac = ruc_fac;
        this.fk_id_per = fk_id_per;
        this.fecha_fac = fecha_fac;
        this.fk_id_pag = fk_id_pag;
        this.descuento_fac = descuento_fac;
        this.total_fac = total_fac;
    }

    public int getId_fac() {
        return id_fac;
    }

    public void setId_fac(int id_fac) {
        this.id_fac = id_fac;
    }

    public String getRuc_fac() {
        return ruc_fac;
    }

    public void setRuc_fac(String ruc_fac) {
        this.ruc_fac = ruc_fac;
    }

    public int getFk_id_per() {
        return fk_id_per;
    }

    public void setFk_id_per(int fk_id_per) {
        this.fk_id_per = fk_id_per;
    }

    public Date getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(Date fecha_fac) {
        this.fecha_fac = fecha_fac;
    }

    public int getFk_id_pag() {
        return fk_id_pag;
    }

    public void setFk_id_pag(int fk_id_pag) {
        this.fk_id_pag = fk_id_pag;
    }

    public double getDescuento_fac() {
        return descuento_fac;
    }

    public void setDescuento_fac(double descuento_fac) {
        this.descuento_fac = descuento_fac;
    }

    public double getTotal_fac() {
        return total_fac;
    }

    public void setTotal_fac(double total_fac) {
        this.total_fac = total_fac;
    }
    
    
    
    
    
    
}
