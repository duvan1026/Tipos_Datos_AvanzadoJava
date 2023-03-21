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

        for(String i: nombres){
            System.out.println(i);
        }


    }
}
