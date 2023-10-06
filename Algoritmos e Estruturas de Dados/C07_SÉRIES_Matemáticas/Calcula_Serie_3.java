package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Serie_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        double serieN = 0;
        System.out.println("Informe o número de repetiçoes: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++){
            serieN += (1+Math.sqrt(4*aux))/(3*aux);
        }
        System.out.println("SérieN = "+serieN);
        teclado.close();
    }
}
