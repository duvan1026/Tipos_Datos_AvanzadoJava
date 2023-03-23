package EntradaSalida.Scanner;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String urlFile = "J:\\Poryects_Duvan\\Spring\\Tipos_Datos_AvanzadoJava\\file.txt";


        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            int a = scanner.nextInt();// Bloquea la ejecución del programa hasta que se ingrese un valor por consola.
            int b = scanner.nextInt();// Bloquea la ejecución del programa hasta que se ingrese un valor por consola.
            System.out.println("Enteros son: " + a + " " + b);

        } catch ( FileNotFoundException e ){
            System.out.println("Error en la lectura del fichero: " + e.getClass());
        } catch( IOException e ){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }

    }

}
