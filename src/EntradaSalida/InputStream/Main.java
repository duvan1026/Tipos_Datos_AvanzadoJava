package EntradaSalida.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args){
        try{
            // Se coloca la ruta donde se neucentra alojado el fichero
            InputStream fichero = new FileInputStream("J:\\Poryects_Duvan\\Spring\\Tipos_Datos_AvanzadoJava\\file.txt"); // Lee desde fichero

            // Se leeel fichero completo, pero no debe ser muy grande
//            byte[] datos = fichero.readAllBytes();// se lee el fichero pero no debe ser muy grande
//
//            for(byte dato: datos){// Leer un fichero
//                System.out.println((char) dato);
//            }

            int dato = fichero.read();
            while (dato != -1){// cuando sea igual a -1 no tiene mas datos que leer.
                System.out.println(dato);
                dato = fichero.read();
            }

        } catch ( FileNotFoundException e ){
            System.out.println("Error en la lectura del fichero: " + e.getClass());
        } catch( IOException e ){
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }


    }

}
