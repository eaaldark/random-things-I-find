import java.util.Enumeration;
import java.util.Hashtable;

public class hashtableshido {
    public static void main(String[] args) {

        Hashtable<String, String> contenedor = new Hashtable<String, String>();

        contenedor.put("101", "Harry");
        contenedor.put("102", "Jorge");
        contenedor.put("103", "Maria");


        System.out.println(contenedor.get("101")+" "+contenedor.get("102")+" "+contenedor.get("103"));

        // Mostrar datos
        Enumeration<String> enumeration = contenedor.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("hashtable valores: " + enumeration.nextElement());
        }
        // Mostrar llaves
        Enumeration<String> llaves = contenedor.keys();
        while (llaves.hasMoreElements()) {
            System.out.println("hashtable llaves: " + llaves.nextElement());
        }

        System.out.println("Claves: " +contenedor.keys());

    }
}