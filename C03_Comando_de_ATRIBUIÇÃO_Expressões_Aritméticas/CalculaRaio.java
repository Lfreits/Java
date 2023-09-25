package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class CalculaRaio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, angulo, raio, pi;
        pi = 3.1416;
        System.out.println("Informe a área do setor circular:");
        area = teclado.nextDouble();
        System.out.println("Informe o ângulo:");
        angulo = teclado.nextDouble();
        raio = Math.sqrt((360*area)/(angulo*pi));
        System.out.println("Raio = "+raio);
        teclado.close();
    }
}
