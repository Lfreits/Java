package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;

public class Desenha_Matriz {
    public static void main(String[] args) {
        int numero, aux2;
        String simbolo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 20");
        numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe um símbolo qualquer");
        simbolo = teclado.nextLine();
        for (int aux1 = 1; aux1 <= numero; aux1++) {
            for (aux2 = 1; aux2 <= numero; aux2++) {
                System.out.print(simbolo);
            }
            System.out.print("\n");
        }
        teclado.close();
    }
}

