package String;

public class Main {

    public static void main(String[] args){

        /*
        String cadena = "MENSAJE DE TEXTo";

        int cadenaLen = cadena.length(); // determinar el tamaño de la cadena
        System.out.println("La longitud de mi cadena es: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase(); // convertimos cadena en minuscula;
        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase(); // convertimos cadena en mayuscula;
        System.out.println("La cadena ahora es: " + cadenaMayus);
        */


        String cadena = "Mensaje de texto";

        /*
        boolean resultado1 = cadena.startsWith("Men"); // Compara si los caracteres del string inician con los siguientes caracteres, dato de salida boolean
        if(resultado1){
            System.out.println("Empieza por 'Men'");
        }else {
            System.out.println("No empieza por 'Men'");
        }


        boolean resultado2 = cadena.endsWith("o"); // Compara si los caracteres del string terminan con los siguientes caracteres, dato de salida boolean
        if(resultado2){
            System.out.println("Termina por 'o'");
        }else {
            System.out.println("No Termina por 'o'");
        }

        char letra = cadena.charAt(4); // obtiene el caracter ubicado en la posición seteada del string
        System.out.println("Caracter es: " + letra);
        */


        for(int i = 0; i < cadena.length(); i++){ // recorremos una cadena de texto
            System.out.println("caracter actual: " + cadena.charAt(i));
        }


        /*********  ejecicio de cadena   ***********/

        String cadenaInversa = "";

        for(int i = cadena.length() - 1; i >= 0; i--){ // recorremos una cadena de texto
            System.out.println("caracter actual: " + cadena.charAt(i));
            cadenaInversa = cadenaInversa + cadena.charAt(i);

        }

        System.out.println("La cadena invertida es: " + cadenaInversa);

        /********************************/



    }
}
