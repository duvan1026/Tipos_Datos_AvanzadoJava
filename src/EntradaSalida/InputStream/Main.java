package EntradaSalida.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args){
        try{
            InputStream fichero = new FileInputStream("/etc/password"); // Lee desde fichero
        } catch ( FileNotFoundException e ){
            System.out.println("Error en la lectura del fichero");
        }


    }

}
