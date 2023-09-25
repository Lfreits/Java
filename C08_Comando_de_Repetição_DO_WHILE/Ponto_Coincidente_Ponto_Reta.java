package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;

public class Ponto_Coincidente_Ponto_Reta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y, a, b, c, d;
        System.out.println("Informe o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Informe o valor de C: ");
        c = teclado.nextDouble();
        do {
            System.out.println("Informe o valor de X: ");
            x = teclado.nextDouble();
            System.out.println("Informe o valor de Y: ");
            y = teclado.nextDouble();
            d = (((a * x) + (b * y) + c) / (Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)))));
        } while (d != 0);
        System.out.println("X final = "+x);
        System.out.println("Y final = "+y);
        teclado.close();
    }
}
