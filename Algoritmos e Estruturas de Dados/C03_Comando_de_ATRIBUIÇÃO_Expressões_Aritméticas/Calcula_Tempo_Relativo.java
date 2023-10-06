package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Calcula_Tempo_Relativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double t, v, c, T;
        c = (3.0*(Math.pow(10.0,8.0)));
        System.out.println("Informe a velocidade em m/s: ");
        v = teclado.nextDouble();
        System.out.println("Informe o tempo em segundos: ");
        t = teclado.nextDouble();
        T = (t*(1.0/(Math.sqrt(1.0-(Math.pow(v,2.0)/Math.pow(c,2.0))))));
        System.out.printf("Tempo relativo = %.4f",T);
        teclado.close();
    }
}
