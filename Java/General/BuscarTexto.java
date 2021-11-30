import java.util.ArrayList;

public class BuscarTexto {
    public static void main(String[] args) {
        String texto = "/storage/emulated/0";
        String texto2 = "/storage/9LJA-6JR3";
        long storage1 = 1073741824;//usado
        long storage2 = 1653753794;//usado

        //String[] palabras = texto.split(" ");
        //ArrayList<String> almacenamiento = new ArrayList<>();
        //ArrayList<String> listado = new ArrayList<>();

        //long totalSum = 0;
        //long startTime = 0;

/*      for (int i = 0; i < palabras.length; i++) {
            //startTime = System.currentTimeMillis();
            //if (palabras[i].equals("clase")){
                if (palabras[i].contains("-")) {
                System.out.println("Encontrado: " + palabras[i]);
            }
            //totalSum+= (System.currentTimeMillis()-startTime);
        }*/

        //System.out.println("Segundos: "+ totalSum/palabras.length);
        /*
        for (String i : palabras)
            if (i.equals("clase"));
        System.out.println("Si esta");
        */

        //almacenamiento.add("6F3A-2L4G");
        //almacenamiento.add("9LJA-6JR3");
        //almacenamiento.add("emulated");
        //almacenamiento.add("lost.dir");
        //almacenamiento.add("fruco");

        //for (int i = 0; i < almacenamiento.size(); i++) {
        //    if (almacenamiento.get(i).contains("-") && almacenamiento.get(i).length()==9) {
        //        System.out.println("Encontrado: " + almacenamiento.get(i));
        //        listado.add(almacenamiento.get(i));
        //    }
        //}

        //for (int i = 0; i < listado.size(); i++) {
        //    System.out.println(listado.get(i));
        //}

            String gbused = "";
            long result = 0;

            try {
                result = storage2/1024^3;
                gbused = result+" GB";
            } catch (Exception e) {
                e.printStackTrace();
            }

                gbused = result+" GB";
            System.out.println(gbused);

    }
}