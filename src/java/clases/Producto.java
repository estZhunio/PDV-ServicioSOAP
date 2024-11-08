package clases;

public class Producto {
    private int id_pro;
    private int stock_pro;
    private double precioUnitario_pro;
    private String unidad_pro;
    private boolean iva_pro;
    private int fk_id_cla;
    private int fk_id_prov;

    public Producto() {
    }

    public Producto(int id_pro, int stock_pro, double precioUnitario_pro, String unidad_pro, boolean iva_pro, int fk_id_cla, int fk_id_prov) {
        this.id_pro = id_pro;
        this.stock_pro = stock_pro;
        this.precioUnitario_pro = precioUnitario_pro;
        this.unidad_pro = unidad_pro;
        this.iva_pro = iva_pro;
        this.fk_id_cla = fk_id_cla;
        this.fk_id_prov = fk_id_prov;
    }
    
    

    public int getId_pro() {
        return id_pro;
    }

    public int getStock_pro() {
        return stock_pro;
    }

    public double getPrecioUnitario_pro() {
        return precioUnitario_pro;
    }

    public String getUnidad_pro() {
        return unidad_pro;
    }

    public boolean isIva_pro() {
        return iva_pro;
    }

    public int getFk_id_cla() {
        return fk_id_cla;
    }

    public int getFk_id_prov() {
        return fk_id_prov;
    }
    
    
    
}
