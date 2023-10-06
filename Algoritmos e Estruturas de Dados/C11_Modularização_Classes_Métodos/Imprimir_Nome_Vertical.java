package C11_Modularização_Classes_Métodos;

import java.util.Scanner;

public class Imprimir_Nome_Vertical {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Informe o nome completo: ");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String[] nomes = nome.split("");
        for (int aux = 0; aux < nomes.length; aux++){
            System.out.println(nomes[aux]);
        }
        teclado.close();
    }
}
