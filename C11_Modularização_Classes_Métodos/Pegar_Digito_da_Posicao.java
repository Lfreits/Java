package C11_Modularização_Classes_Métodos;

import java.util.Scanner;

public class Pegar_Digito_da_Posicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posicao,numero;
        System.out.println("Informe o número para pegar um dígito dele: ");
        numero = teclado.nextInt();
        System.out.println("Informe a posição do número: ");
        posicao = teclado.nextInt();
        System.out.println(Pegar_numero(numero,posicao));
        teclado.close();
    }
    public static int Pegar_numero(int num_inteiro, int posicao){
        if (posicao == 2){
            num_inteiro /= 10;
        }
        if (posicao == 3){
            num_inteiro /= 100;
        }
        if (posicao == 4){
            num_inteiro /= 1000;
        }
        if (posicao == 5){
            num_inteiro /= 10000;
        }
        if (posicao == 6){
            num_inteiro /= 100000;
        }
        if (posicao == 7){
            num_inteiro /= 1000000;
        }
        if (posicao == 8){
            num_inteiro /= 10000000;
        }
        if (posicao == 9){
            num_inteiro /= 100000000;
        }
        return (num_inteiro % 10);
    }
}
