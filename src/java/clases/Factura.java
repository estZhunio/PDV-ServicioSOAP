package clases;

import clases.Persona;
import clases.TipoPago;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement  // Esta anotación permite que la clase se serialice
public class Factura {
    private int id_fac;
    private String ruc_fac;
    private Persona fk_id_per;
    private Date fecha_fac;
    private TipoPago fk_id_pag;
    private double descuento_fac;
    private double total_fac;
    
    @XmlElementWrapper(name = "facturas")
    @XmlElement(name = "itemFactura")
    private List<ItemFactura> facturas;

    public Factura() {}

    public Factura(int id_fac, String ruc_fac, Persona fk_id_per, Date fecha_fac, TipoPago fk_id_pag, double descuento_fac, double total_fac, List<ItemFactura> facturas) {
        this.id_fac = id_fac;
        this.ruc_fac = ruc_fac;
        this.fk_id_per = fk_id_per;
        this.fecha_fac = fecha_fac;
        this.fk_id_pag = fk_id_pag;
        this.descuento_fac = descuento_fac;
        this.total_fac = total_fac;
        this.facturas = facturas;
    }

    // Getters y Setters con las anotaciones necesarias

    public List<ItemFactura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<ItemFactura> facturas) {
        this.facturas = facturas;
    }

    public TipoPago getFk_id_pag() {
        return fk_id_pag;
    }

    public void setFk_id_pag(TipoPago fk_id_pag) {
        this.fk_id_pag = fk_id_pag;
    }

    @XmlTransient  // Evita la serialización del ID si no es necesario
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

    public Persona getFk_id_per() {
        return fk_id_per;
    }

    public void setFk_id_per(Persona fk_id_per) {
        this.fk_id_per = fk_id_per;
    }

    public Date getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(Date fecha_fac) {
        this.fecha_fac = fecha_fac;
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
