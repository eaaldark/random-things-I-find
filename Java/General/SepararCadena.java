

public class SepararCadena {
    public static void main(String[] args) {
        
        //Separar cadena en cada coma
        String[] items = "A,B,C,D,F,G".split(",", -1);
        //String[] items = "A,B,C,,,,,,,,,,".split(","); 

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        //http://www.forosdelweb.com/f45/llenar-filas-jtable-1025035/
        
    }
}