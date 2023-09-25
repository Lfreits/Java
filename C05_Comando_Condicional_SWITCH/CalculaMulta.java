package C05_Comando_Condicional_SWITCH;

import java.util.Scanner;
public class CalculaMulta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int atraso, valorImposto;
        double valorFinal, multa;
        System.out.println("Informe o valor do imposto: ");
        valorImposto = teclado.nextInt();
        System.out.println("Informe os dias de atraso: ");
        atraso = teclado.nextInt();
        switch (atraso){
            case 1,2,3,4,5 -> valorFinal = 0;
            case 6,7,8 -> valorFinal = 0.02*valorImposto;
            case 9,10 -> valorFinal = (0.1*valorImposto+(0.005*valorImposto*atraso));
            default -> valorFinal = (1.5*valorImposto)+atraso;
        }
        multa = (valorFinal);
        System.out.println("Multa = "+multa);
        teclado.close();
    }
}