package C11_Modularização_Classes_Métodos;

import java.util.Scanner;

public class Chutar_Numero_Sorteado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0, numero, chute = 0;
        numero = (int) Math.floor(Math.random()*100);
        do {
            cont++;
            System.out.println("Tente encontrar o número sorteado! Tentativa n°"+cont);
            chute = teclado.nextInt();
            if (chute == numero){
                System.out.println("Você acertou! Parabéns");
                break;
            } else if (chute < numero){
                System.out.println("O número é maior que seu chute");
            } else if (chute > numero){
                System.out.println("O número é menor que seu chute");
            }
        } while (chute != numero);
        teclado.close();
    }
}
