package C05_Comando_Condicional_SWITCH;

import java.util.Scanner;
public class Numeros_Loteria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acertos;
        System.out.println("Informe o número de acertos: ");
        acertos = teclado.nextInt();
        switch (acertos) {
            case 1,2,3,4,5 -> System.out.println("Você não ganhou nenhum prêmio");
            case 6,7,8,9,10 -> System.out.println("Você ganhou outro cartão");
            case 11 -> System.out.println("Você ganhou R$100,00");
            case 12 -> System.out.println("Você ganhou R$1000,00");
            case 13-> System.out.println("Você ganhou 50.000,00");
            default -> System.out.println("Resposta inválida");
        } teclado.close();
    }
}
