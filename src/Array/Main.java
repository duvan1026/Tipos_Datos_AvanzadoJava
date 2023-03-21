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

        /*
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

        // 2. Forma de recorrer un array(forma larga)
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombre : " + nombres[i] + " en posición: " + i);
        }
        */

        /*
        // Forma de inicializar una array bidimensional cuando no sabemos los valores
        int arrayBid[][] = new int[2][4];

        arrayBid[0][0] = 1;
        arrayBid[0][1] = 2;
        arrayBid[0][2] = 3;
        arrayBid[0][3] = 4;

        arrayBid[1][0] = 10;
        arrayBid[1][1] = 20;
        arrayBid[1][2] = 30;
        arrayBid[1][3] = 40;
        */

        // Forma de inicializar un array bidimensional cuandos abemos los valores
        int arrayBid[][] = {
                { 1,  2,  3,  4},
                { 10, 20, 30, 40}
        };


        for(int i=0; i < arrayBid.length; i++){
            for (int j=0; j < arrayBid[i].length; j++){
                System.out.print(arrayBid[i][j]);
            }
            System.out.println("");
        }







    }
}
