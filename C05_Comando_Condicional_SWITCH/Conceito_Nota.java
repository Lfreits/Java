package C05_Comando_Condicional_SWITCH;

import java.util.Scanner;
public class Conceito_Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3, media;
        System.out.println("Informe a primeira nota parcial");
        nota1 = teclado.nextInt();
        System.out.println("Informe a segunda nota parcial");
        nota2 = teclado.nextInt();
        System.out.println("Informe a terceira nota parcial");
        nota3 = teclado.nextInt();
        media = ((nota1+nota2+nota3)/3);
        switch (media) {
            case 9,10 -> System.out.println("Conceito A");
            case 8 -> System.out.println("Conceito B");
            case 7 -> System.out.println("Conceito C");
            case 5,6 -> System.out.println("Conceito D");
            case 1,2,3,4 -> System.out.println("Conceito E");
            default -> System.out.println("Resposta inválida");
        } teclado.close();
    }
}
