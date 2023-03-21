package ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // CapacidadArraylist = capacidadArrayList + (capacidadarrayList * 0.5)
        ArrayList<String> lista = new ArrayList<String>();


        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");



        /* // Guardar un ArrayList en un array
        String array[] = new String[lista.size()];// setea el tamaño del array al tamaño del arraylist

        for(int i = 0; i < lista.size(); i++){
            array[i] = lista.get(i);
        }

        for(String element : array){
            System.out.println(element);
        }

        // Otra forma

        for(Object arrayObjecto : lista.toArray()){
            System.out.println(arrayObjecto.toString());
        }
        */


        /*
        lista.remove("ElementoB");
        //lista.remove(2); // se puede eliminar tambien en posicion
        System.out.println("Contenido: " + lista);
        */

        /*  // recorrer los ArrayList
        for(String nombre: lista){
            System.out.println(nombre);
        }

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        */



    }

}
