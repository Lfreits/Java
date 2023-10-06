package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Calcula_Volume_Esfera {
    public static void main(String[] args) {
        double area, volume, raio, pi;
        Scanner teclado = new Scanner(System.in);
        pi = 3.1416;
        System.out.println("Informe o raio da esfera: ");
        raio = teclado.nextDouble();
        area = (4.0*pi*Math.pow(raio,2.0));
        volume = ((4.0/3.0)*pi*Math.pow(raio,3.0));
        System.out.println("Área = "+area);
        System.out.println("\nVolume = "+volume);
        teclado.close();
    }
}
