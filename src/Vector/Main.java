package Vector;

import java.util.Vector;

public class Main {
    /**
     * Vectores, No es necesario definir un tamaño inicial o final,
     * se ajustan automaticamente al tamaño de los datos.
     * Son Arrays dinamicos
     * Los vectores crecen automaticamente
     * crecer un vector es una operación que consume bastante recursos
     * @param args
     */
    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>(16); // capacidad inicial, incremento
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        // decrecer un vector
        System.out.println("vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        vector.trimToSize();// reduce la capacidad del vector hasta su tamaño
        System.out.println("vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());


        /* //recorrer un vector
        for(int i: vector){
            System.out.println("Valor actual del vector: " + i);
        }

        for( int i = 0; i < vector.size(); i++){
            if( i % 2 == 0 ){
                vector.remove(i);
            }else{
                System.out.println("valores es: " + vector.get(i));
            }

        }
        */

        /* // Obtener el tamaño del vector y su capacidad
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);// se setea la poscion del vector que se desea eliminar
        System.out.println("Datos del vector: " + vector);

        System.out.println("vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        */

        /* // Comparar un vector con otro
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales: " + resultado);
        */


    }

}
