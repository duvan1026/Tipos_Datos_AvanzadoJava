package EntradaSalida.PrintStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args){

        String urlFile = "J:\\Poryects_Duvan\\Spring\\Tipos_Datos_AvanzadoJava\\file.txt";

        try{
            InputStream in = new FileInputStream(urlFile);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("copia.txt");
            out.write(datos);
            out.close();

        }catch(Exception e){
            System.out.println("Exception:" + e.getMessage());
        }



    }

}
