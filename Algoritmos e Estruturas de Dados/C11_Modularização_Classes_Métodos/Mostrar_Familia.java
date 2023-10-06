package C11_Modularização_Classes_Métodos;

import java.util.Scanner;
public class Mostrar_Familia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, familia;
        System.out.println("Informe o nome completo da pessoa: ");
        nome = teclado.nextLine();
        String[] nomes = nome.split(" ");
        familia = nomes[nomes.length-1];
        System.out.println("Família: "+familia);
        teclado.close();
    }
}
