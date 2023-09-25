package C11_Modularização_Classes_Métodos;

import java.util.Scanner;
public class Distancia_Entre_2_Pontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2;
        System.out.println("Informe o valor de x do ponto 1: ");
        x1 = teclado.nextDouble();
        System.out.println("Informe o valor de y do ponto 1: ");
        y1 = teclado.nextDouble();
        System.out.println("Informe o valor de x do ponto 2: ");
        x2 = teclado.nextDouble();
        System.out.println("Informe o valor de y do ponto 2: ");
        y2 = teclado.nextDouble();
        System.out.println(distancia_entre_pontos(x1,y1,x2,y2));
        teclado.close();
    }
    public static double distancia_entre_pontos(double x1, double y1, double x2, double y2) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distancia;
    }
}
