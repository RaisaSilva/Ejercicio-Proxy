package proxy.MyProxyB;

public class ServidorSecundario implements IServidor {

   private File file;

    public ServidorSecundario(){
    }

    @Override
    public void request() {
        System.out.println("Copia de seguridad realizada");
        System.out.println("nombre del archivo: "+file.getNombre());
        System.out.println("Tipo de formato del archivo: "+file.getFormato());
        System.out.println();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
