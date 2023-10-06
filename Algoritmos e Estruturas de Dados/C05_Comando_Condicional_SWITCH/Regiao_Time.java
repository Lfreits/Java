package C05_Comando_Condicional_SWITCH;

import java.util.Scanner;
public class Regiao_Time {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String time;
        System.out.println("Informe o time: ");
        time = teclado.nextLine();
        switch (time) {
            case "América", "Atlético", "Cruzeiro", "Vila Nova" -> System.out.println("Seu time é de Minas Gerais");
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" -> System.out.println("Seu time é do Rio de Janeiro");
            case "Corinthians", "Palmeiras", "Santos", "São Paulo" -> System.out.println("Seu time é de São Paulo");
            case "Grêmio", "Internacional", "Juventude" -> System.out.println("Seu time é de Rio Grande do Sul");
            case "Náutico", "Santa Cruz", "Sport" -> System.out.println("Pernambuco");
            default -> System.out.println("Resposta inválida");
        } teclado.close();
    }
}
