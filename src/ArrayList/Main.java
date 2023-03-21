package ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // CapacidadArraylist = capacidadArrayList + (capacidadarrayList * 0.5)
        ArrayList<String> lista = new ArrayList<String>();


        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");
        System.out.println("Contenido: " + lista);



    }

}
