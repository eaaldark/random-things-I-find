import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ordenar {

    public static void main(String[] args) {
        List nombres = new LinkedList<>();
        // Agregamos los nombres.
        nombres.add("Aries");
        nombres.add("Tauro");
        nombres.add("Geminis");
        nombres.add("Cancer");
        nombres.add("Leo");
        nombres.add("Virgo");
        nombres.add("Libra");
        nombres.add("Escorpio");
        nombres.add("Sagitario");
        nombres.add("Capricornio");
        nombres.add("Acuario");
        nombres.add("Piscis");

        // Ordenamos la lista.
        Collections.sort(nombres);

        // Imprimimos
        for (int i = 0; i <= nombres.size()-1;i++) {

            System.out.println(nombres.get(i));
        }

        // El resultado seria: Acuario, Aries, Cancer, Capricornio, Escorpio, Geminis,
        // Leo, Libra, Piscis, Sagitario, Tauro, Virgo.
    }
}