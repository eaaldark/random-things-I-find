public class Polindromo {
      public static void main(String[] args) {
            // detectar palíndromo si es igual de izq a der y viceversa
            //String sPalabra = "odio la luz azul al oido";
            String sPalabra = "ojo";
            sPalabra = sPalabra.replace(" ", "");
            int inc = 0;
            int des = sPalabra.length() - 1;
            boolean bError = false;

            while ((inc < des) && (!bError)) {

                  if (sPalabra.charAt(inc) == sPalabra.charAt(des)) {
                        inc++;
                        des--;
                  } else {
                        bError = true;
                  }
            }

            if (bError == true) {
                  System.out.println("no Palindromo");
            } else {
                  System.out.println("Palindromo");
            }
      }
}
