package BigDecimal;

import java.math.BigDecimal;

public class main {
    /**
     * Se itiliza para valores que se requiere alta fidelidad
     * maneja grandes decimales
     * @param args
     */
    public static void main(String[] args){

        //System.out.println(0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f);
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado.toString());

    }

}
