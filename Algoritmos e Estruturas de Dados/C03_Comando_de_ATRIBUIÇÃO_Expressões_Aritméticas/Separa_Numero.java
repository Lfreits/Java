package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Separa_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, n1, n2, n3, n4, n5;
        System.out.println("Informe um número inteiro de 5 dígitos: ");
        numero = teclado.nextInt();
        n1 = (numero/10000);
        n2 = ((numero/1000)%10);
        n3 = ((numero/100)%10);
        n4 = ((numero/10)%10);
        n5 = (numero%10);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        teclado.close();
    }
}
