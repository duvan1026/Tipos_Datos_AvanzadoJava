package Vector;

import java.util.Vector;

public class Main {
    /**
     * Vectores, No es necesario definir un tamaño inicial o final,
     * se ajustan automaticamente al tamaño de los datos.
     * Son dinamicos
     * @param args
     */
    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>(1, 15); // capacidad inicial, incremento
        vector.add(1);
        vector.add(2);
        vector.add(3);

        /*
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);// se setea la poscion del vector que se desea eliminar
        System.out.println("Datos del vector: " + vector);

        System.out.println("vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        */

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales: " + resultado);



    }

}
