package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Verifica_Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont = 0;
        System.out.println("Informe um número inteiro maior que zero: ");
        numero = teclado.nextInt();
        for (int aux = 1; aux <= numero; aux++){
            if (numero % aux == 0){
                cont++;
            }
        }
        if (cont == 2){
            System.out.println("O número informado é primo");
        } else {
            System.out.println("O número informado não é primo");
        }
        teclado.close();
    }
}
