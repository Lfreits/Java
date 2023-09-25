package C05_Comando_Condicional_SWITCH;

import java.util.Scanner;
public class Investigacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char resposta;
        int classificacao = 0;
        System.out.println("Telefonou para a vítima?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            classificacao = (classificacao+1);
        }
        System.out.println("Esteve no local do crime?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            classificacao = (classificacao+1);
        }
        System.out.println("Mora perto da vítima?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            classificacao = (classificacao+1);
        }
        System.out.println("Devia para a vítima?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            classificacao = (classificacao+1);
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            classificacao = (classificacao+1);
        }
        switch (classificacao) {
            case 2 -> System.out.println("Pessoa é suspeita");
            case 3,4 -> System.out.println("Pessoa é cúmplice");
            case 5 -> System.out.println("Pessoa é o assassino");
            default -> System.out.println("Pessoa é inocente");
        }
        teclado.close();
    }
}
