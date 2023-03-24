package EntradaSalida.PrintStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args){

        String urlFile = "J:\\Poryects_Duvan\\Spring\\Tipos_Datos_AvanzadoJava\\file.txt"; // fichero origen

        try{
            InputStream in = new FileInputStream(urlFile);
            byte[] datos = in.readAllBytes();
            in.close();// cierra el fichero

            PrintStream out = new PrintStream("copia.txt");// fichero destino
            out.write(datos);
            out.close();// cierra el fichero

        }catch(Exception e){
            System.out.println("Exception:" + e.getMessage());
        }



    }

}
