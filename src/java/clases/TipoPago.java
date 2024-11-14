package clases;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TipoPago implements Serializable{
    
    private int id_pag;
    private String tipo_pag;
    private String descripcion_pag;

    public TipoPago() {
    }

    public TipoPago(int id_pag, String tipo_pag, String descripcion_pag) {
        this.id_pag = id_pag;
        this.tipo_pag = tipo_pag;
        this.descripcion_pag = descripcion_pag;
    }

    public int getId_pag() {
        return id_pag;
    }

    public void setId_pag(int id_pag) {
        this.id_pag = id_pag;
    }

    public String getTipo_pag() {
        return tipo_pag;
    }

    public void setTipo_pag(String tipo_pag) {
        this.tipo_pag = tipo_pag;
    }

    public String getDescripcion_pag() {
        return descripcion_pag;
    }

    public void setDescripcion_pag(String descripcion_pag) {
        this.descripcion_pag = descripcion_pag;
    }
    
    
    
}
