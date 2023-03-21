package mapa;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        //definimos un HasMapa que:
        // (claves: String , valores : int)
        // No puede tener la clave duplciada
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1",10);
        mapa.put("clave2",20);
        mapa.put("clave3",30);

        for(Map.Entry elemento: mapa.entrySet()){// me permite traer los elementos del map
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

        /*
        mapa.remove("clave2"); // elimina la clave
        System.out.println(mapa);
        */

        /*
        System.out.println(mapa.get("clave1")); // Imprimimos el valor correspondiente a la clave setada

        //mapa.put("clave3", 90); // reemplaza  el valor correspondiente a la clave
        mapa.replace("clave4",190);// sino existe la clave la ignora
        */
    }

}
