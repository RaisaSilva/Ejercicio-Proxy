package proxy.MyProxyB;

public class File {

    private String nombre;
    private String formato;

    public File(String nombre, String formato) {
        this.nombre = nombre;
        this.formato = formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}