package clases;

public class Usuario {
    private int id_usu;
    private int id_per;
    private String usuario_usu;
    private String password_usu;

    public Usuario() {
    }

    public Usuario(int id_usu, int id_per, String usuario_usu, String password_usu) {
        this.id_usu = id_usu;
        this.id_per = id_per;
        this.usuario_usu = usuario_usu;
        this.password_usu = password_usu;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getId_per() {
        return id_per;
    }

    public void setId_per(int id_per) {
        this.id_per = id_per;
    }

    public String getUsuario_usu() {
        return usuario_usu;
    }

    public void setUsuario_usu(String usuario_usu) {
        this.usuario_usu = usuario_usu;
    }

    public String getPassword_usu() {
        return password_usu;
    }

    public void setPassword_usu(String password_usu) {
        this.password_usu = password_usu;
    }
    
    public boolean siExiste(String id_per) {
        return true;
    }
}
