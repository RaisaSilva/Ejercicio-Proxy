package proxy.MyProxyB;

public class Client {

    public static void main (String []args){
       Proxy proxy = new Proxy();
       proxy.setFile(new File("Musica", ".zzip"));
       proxy.request();
    }


}
