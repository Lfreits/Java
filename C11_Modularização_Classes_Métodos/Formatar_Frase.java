package C11_Modularização_Classes_Métodos;

import java.util.Scanner;
public class Formatar_Frase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Informe a frase para ser formatada: ");
        frase = teclado.nextLine();
        String[] palavras = frase.split(" ");
        for (int aux = 0; aux < palavras.length; aux++){
            palavras[aux] = palavras[aux].substring(0,1).toUpperCase() + palavras[aux].substring(1).toLowerCase();
            System.out.print(palavras[aux]+" ");
        }
        teclado.close();
    }
}
