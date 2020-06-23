package proxy.MyProxyB;

/**
 * @autor : eynar.pari
 * @date : 23/06/2020.
 **/
public class ServidorPrincipal implements IServidor {

   private File file;

    public ServidorPrincipal(){
    }

    @Override
    public void request() {
        System.out.println("Solicitud realizada exitosamente");
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
