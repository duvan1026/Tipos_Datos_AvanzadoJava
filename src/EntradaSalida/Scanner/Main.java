package EntradaSalida.Scanner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String urlFile = "J:\\Poryects_Duvan\\Spring\\Tipos_Datos_AvanzadoJava\\file.txt";


        try{
            Scanner scanner = new Scanner(System.in);

            boolean ok = false;

            do{
                System.out.println("Ingrese dos numeros: ");
                scanner.reset();
                try{
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                }catch ( InputMismatchException e) {
                    System.out.println("Numeros invalidos");
                }
            } while (!ok);




            // Se coloca la ruta donde se neucentra alojado el fichero
            InputStream fichero = new FileInputStream(urlFile); // Lee desde fichero
            BufferedInputStream ficherBuffer = new BufferedInputStream(fichero);// Accedemos lo que esta en memoria

            int dato = fichero.read();
            while (dato != -1){// cuando sea igual a -1 no tiene mas datos que leer.
                System.out.println(((char) dato));
                dato = ficherBuffer.read();
            }

        } catch ( FileNotFoundException e ){
            System.out.println("Error en la lectura del fichero: " + e.getClass());
        } catch( IOException e ){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }

    }

}
