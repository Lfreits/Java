package C11_Modularização_Classes_Métodos;


import java.util.Scanner;

public class Formatar_Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, familia;
        char primeiraLetra;
        System.out.println("Informe o nome completo da pessoa: ");
        nome = teclado.nextLine();
        nome = nome.toUpperCase();
        String[] nomes = nome.split(" ");
        familia = nomes[nomes.length-1];
        System.out.print(familia+", ");
        for (int aux = 0; aux < nomes.length-1; aux++){
            primeiraLetra = nomes[aux].charAt(0);
            System.out.print(primeiraLetra+". ");
        }
        teclado.close();
    }
}
