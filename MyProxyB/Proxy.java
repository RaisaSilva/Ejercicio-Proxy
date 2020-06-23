package proxy.MyProxyB;

public class Proxy implements IServidor {

    private ServidorPrincipal servidorPrincipal;
    private ServidorSecundario servidorSecundario;
    private File file;

    public Proxy(){
        servidorPrincipal = new ServidorPrincipal();
        servidorSecundario = new ServidorSecundario();
    }

    @Override
    public void request() {
        if (file.getFormato().endsWith(".zip") || file.getFormato().endsWith(".rar")){
            this.servidorPrincipal.setFile(this.file);
            this.servidorSecundario.setFile(this.file);
            this.servidorPrincipal.request();
            this.servidorSecundario.request();


        }else{
            System.out.println("Formato incorrecto "+ file.getFormato());

        }

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
