package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Serie_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        double serieH = 0;
        System.out.println("Informe o número de termos da série: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++){
            serieH += (((aux*2)-2)+(aux*3))/((6.0*aux)+1);
        }
        serieH = (serieH*5);
        System.out.println("SérieH = "+serieH);
        teclado.close();
    }
}
