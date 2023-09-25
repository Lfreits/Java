package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Calcula_Area_Circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, raio;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.println("Informe o raio do círculo: ");
            raio = teclado.nextDouble();
            area = (Math.PI*Math.pow(raio,2));
            System.out.println("Área do círculo = "+area);
        }
        teclado.close();
    }
}
