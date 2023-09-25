package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Calcula_Serie_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double S = 0, x, ln;
        int rep;
        System.out.println("Informe o número de n: ");
        rep = teclado.nextInt();
        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        ln = Math.pow(2.718281828, x);
        for (int aux = 1; aux <= rep; aux++){
            S += Math.pow(x, aux)/aux;
        }
        S += ln;
        System.out.printf("S = %.1f",S);
        teclado.close();
    }
}
