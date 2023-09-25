package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Verifica_Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, n1, n2, n3, n4;
        System.out.println("Informe o número que deve ser verificado: ");
        numero = teclado.nextInt();
        teclado.close();
        n1 = (numero / 1000);
        n2 = (numero / 100 % 10);
        n3 = (numero / 10 % 10);
        n4 = (numero % 10);
        if (n1 == n4 && n2 == n3) {
            System.out.println("É Palíndromo");
        }else{
                System.out.println("Não é palímdromo");
            }
        }
    }