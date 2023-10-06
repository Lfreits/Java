package C11_Modularização_Classes_Métodos;

import java.util.Scanner;
public class Resultado_Funcao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;
        System.out.println("Informe o valor de x: ");
        x = teclado.nextDouble();
        System.out.println("F(x) = "+ Aux_Resultado_Funcao.fx(x));
        teclado.close();
    }
}
