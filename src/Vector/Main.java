package Vector;

import java.util.Vector;

public class Main {
    /**
     * Vectores, No es necesario definir un tamaño inicial o final,
     * se ajustan automaticamente al tamaño de los datos.
     * @param args
     */
    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

    }

}
