package clases;



public class ItemFactura {
    private int id_item;
    private Factura fk_id_fac;
    private Producto fk_id_pro;
    private int cantidad_item;
    private double precio_item;
    private double subtotal_item;

    public ItemFactura() {
    }

    public ItemFactura(int id_item, Factura fk_id_fac, Producto fk_id_pro, int cantidad_item, double precio_item, double subtotal_item) {
        this.id_item = id_item;
        this.fk_id_fac = fk_id_fac;
        this.fk_id_pro = fk_id_pro;
        this.cantidad_item = cantidad_item;
        this.precio_item = precio_item;
        this.subtotal_item = subtotal_item;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public Factura getFk_id_fac() {
        return fk_id_fac;
    }

    public void setFk_id_fac(Factura fk_id_fac) {
        this.fk_id_fac = fk_id_fac;
    }

    public Producto getFk_id_pro() {
        return fk_id_pro;
    }

    public void setFk_id_pro(Producto fk_id_pro) {
        this.fk_id_pro = fk_id_pro;
    }



    public int getCantidad_item() {
        return cantidad_item;
    }

    public void setCantidad_item(int cantidad_item) {
        this.cantidad_item = cantidad_item;
    }

    public double getPrecio_item() {
        return precio_item;
    }

    public void setPrecio_item(double precio_item) {
        this.precio_item = precio_item;
    }

    public double getSubtotal_item() {
        return subtotal_item;
    }

    public void setSubtotal_item(double subtotal_item) {
        this.subtotal_item = subtotal_item;
    }
    
    
}
