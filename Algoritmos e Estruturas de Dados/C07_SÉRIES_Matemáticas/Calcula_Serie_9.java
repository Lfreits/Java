package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Serie_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep;
        double serie = 0;
        System.out.println("Informe o número de repetições: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++){
            serie += (Math.pow(3,(aux+1)))/((aux+9)*(Math.sqrt(Math.pow((aux*aux),2))));
        }
        serie = 100 - Math.pow(serie,3);
        System.out.println("Série = "+serie);
        teclado.close();
    }
}
