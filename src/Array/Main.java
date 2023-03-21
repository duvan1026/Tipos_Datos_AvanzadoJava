package Array;

public class Main {

    public static void main(String[] args){

        /*
        int arrayUno[] = new int[5]; // indicamos el limite de elementos
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;
        */

        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
            };

        System.out.println("Longitud del array: " + nombres.length);

        // 1. Froma de recorrer un arra(forma corta)
        for(String nombre: nombres){ // Foreach, recorrer un array
            System.out.println("Nombre actual: " + nombre);
        }

        String ultimoNombre = "";
        // 2. Forma de recorrer un array(forma larga)
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombre : " + nombres[i] + " en posición: " + i);
            ultimoNombre = nombres[i];
        }

        System.out.println(ultimoNombre);


    }
}
