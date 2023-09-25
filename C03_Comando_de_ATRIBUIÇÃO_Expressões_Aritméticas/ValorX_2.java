package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class ValorX_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, resultado;
        System.out.println("Informe o valor de x:");
        x = teclado.nextDouble();
        resultado = Math.sqrt(Math.pow(((x/4.0)+1.0),2.0)+((1.0/5.0)*x));
        System.out.println("Resultado = "+resultado);
        teclado.close();
    }
}
