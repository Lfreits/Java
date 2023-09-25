package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Distancia_Ponto_a_Reta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x, y, distancia, r;
        System.out.println("Informe o valor A da reta R:");
        a = teclado.nextDouble();
        System.out.println("Informe o valor B da reta R:");
        b = teclado.nextDouble();
        System.out.println("Informe o valor C da reta R:");
        c = teclado.nextDouble();
        System.out.println("Informe a coordenada x do ponto P:");
        x = teclado.nextDouble();
        System.out.println("Informe a coordenada y do ponto P:");
        y = teclado.nextDouble();
        r = ((a*x)+(b*y)+c);
        distancia = (r/(Math.sqrt(Math.pow(a,2.0)+Math.pow(b,2.0))));
        System.out.println("Distância = "+distancia);
        teclado.close();
    }
}
