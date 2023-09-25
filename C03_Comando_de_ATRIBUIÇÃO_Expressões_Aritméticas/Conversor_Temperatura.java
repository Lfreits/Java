package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Conversor_Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius, kelvin, fahrenheit;
        System.out.println("Informe a temperatura em Celsius:");
        celsius = teclado.nextDouble();
        kelvin = (celsius+273.0);
        fahrenheit = (((celsius*9)+160)/5);
        System.out.println("Kelvin = "+kelvin);
        System.out.println("Fahrenheit = "+fahrenheit);
        teclado.close();

    }
}
