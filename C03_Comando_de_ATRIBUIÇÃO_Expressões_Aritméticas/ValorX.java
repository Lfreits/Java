package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class ValorX {
    public static void main(String[] args) {
        Double x, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        resultado = (Math.pow(x,3)+(4*x)+10);
        System.out.println(resultado);
        teclado.close();
    }
}
