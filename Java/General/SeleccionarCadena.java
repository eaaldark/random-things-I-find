public class SeleccionarCadena {
      public static void main(String[] args) {
            /*
             * / Mostrar una parde de la cadena String sCadena = "Hola Mundo"; String
             * sSubCadena = sCadena.substring(5, 10); System.out.println(sSubCadena);
             */

            String colores = "rojo,amarillo,verde,azul,morado,marrón,blanco,amarillo,negro";
            String[] arrayColores = colores.split(",");

            // En este momento tenemos un array en el que cada elemento es un color.
            for (int i = 0; i < arrayColores.length; i++) {
                  System.out.print(arrayColores[i] + "\n");
            }

      }
}