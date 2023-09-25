package C01_Introducao;

import java.util.Scanner;
public class CalculaIdade {
    public static void main(String[] args) {
        String nome;
        int anoNasc,anoAtual,idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.println("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNasc;
        System.out.println(nome+", você tem/terá "+idade+"anos em "+anoAtual);
        teclado.close();
    }
}
