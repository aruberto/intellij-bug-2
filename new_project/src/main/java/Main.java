
public class Main {

    public static void main(String [] args) {
        ClassLoader cl = Main.class.getClassLoader();

        java.net.URL[] urls = ((java.net.URLClassLoader)cl).getURLs();

        System.out.println("Starting ...");
        for(java.net.URL url: urls){
            System.out.println(url.getFile());
        }
        System.out.println("Finished ...");
    }
}
