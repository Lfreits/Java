package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Teste_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numInt, somaDiv4 = 0;
        int contDiv3 = 0;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.println("Informe o número inteiro: ");
            numInt = teclado.nextDouble();
            if (numInt%2 == 0) {
                System.out.println("Número é par");
            } else {
                System.out.println("Número é ímpar");
            }
            if (numInt%3 == 0) {
                contDiv3++;
            }
            if (numInt%4 == 0) {
                somaDiv4 = somaDiv4 + numInt;
            }
        }
        System.out.println("Soma dos números divisíveis por 4: "+somaDiv4);
        System.out.println("Quantidade de números divisíveis por 3: "+contDiv3);
        teclado.close();
    }
}