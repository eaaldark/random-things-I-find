
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {
      public static void main(String[] args) {

            // Fechas
            Date date = new Date();
            // Caso 1: obtener la hora y salida por pantalla con formato:
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Hora: " + hourFormat.format(date));
            // Caso 2: obtener la fecha y salida por pantalla con formato:
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: " + dateFormat.format(date));
            // Caso 3: obtenerhora y fecha y salida por pantalla con formato:
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("Hora y fecha: " + hourdateFormat.format(date));

            java.text.SimpleDateFormat dateFormat2 = new java.text.SimpleDateFormat("yyMMddkkmmss");
            java.util.Date systemDate = new java.util.Date();
            String date2 = dateFormat2.format(systemDate);
            System.out.println(date2);
      }
}