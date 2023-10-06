package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class X_elevado_a_Y {
    public static void main(String[] args) {
        int x, y, resultado = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo para ser o valor de X: ");
        x = teclado.nextInt();
        System.out.println("Informe um número inteiro e positivo para ser o valor de Y: ");
        y = teclado.nextInt();
        for (int aux = 1; aux <= y; aux++){
            resultado *= x;
        }
        System.out.println(resultado);
        teclado.close();
    }
}
