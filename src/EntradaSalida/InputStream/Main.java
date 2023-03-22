package EntradaSalida.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args){
        try{
            InputStream fichero = new FileInputStream("/etc/password"); // Lee desde fichero

            byte[] datos = fichero.readAllBytes();

            for(byte dato: datos){// Leer un fichero
                System.out.println((char) dato);
            }

        } catch ( FileNotFoundException e ){
            System.out.println("Error en la lectura del fichero: " + e.getClass());
        } catch( IOException e ){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }


    }

}
