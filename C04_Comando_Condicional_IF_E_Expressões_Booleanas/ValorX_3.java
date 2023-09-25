package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class ValorX_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, resultado;
        System.out.println("Informe o valor de x:");
        x = teclado.nextDouble();
        if (x<4) {
            resultado = ((5*x+3)/(Math.sqrt(16-Math.pow(x,2))));
        } else {
            if (x==4) {
            resultado = 0;
            } else {
                resultado = ((5*x+3)/Math.sqrt(Math.pow(x,2)-16));
            }
        }
        System.out.println("Resultado = "+resultado);
        teclado.close();
    }
}
