package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Distancia_2_Pontos {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a coordenada x do ponto 1:");
        x1 = teclado.nextDouble();
        System.out.println("Informe a coordenada y do ponto 1:");
        y1 = teclado.nextDouble();
        System.out.println("Informe a coordenada x do ponto 2:");
        x2 = teclado.nextDouble();
        System.out.println("Informe a coordenada y do ponto 2:");
        y2 = teclado.nextDouble();
        distancia = Math.sqrt(Math.pow(x1-x2,2.0)+Math.pow(y1-y2,2.0));
        System.out.println("A distância entre os dois pontos é de "+distancia);
        teclado.close();
    }
}
