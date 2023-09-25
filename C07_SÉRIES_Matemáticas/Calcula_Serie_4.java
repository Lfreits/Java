package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Serie_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        double serieG = 0;
        System.out.println("Informe o número de termos da série: ");
        rep = teclado.nextInt();
        for (int aux = 0; aux <= rep-1; aux++){
            serieG += ((aux*4.0+1.0)*(aux*4.0+2.0))/((aux*4.0+3.0)*(aux*4.0+4.0));
        }
        serieG = Math.sqrt(serieG);
        System.out.println("SérieG = "+serieG);
        teclado.close();
    }
}
