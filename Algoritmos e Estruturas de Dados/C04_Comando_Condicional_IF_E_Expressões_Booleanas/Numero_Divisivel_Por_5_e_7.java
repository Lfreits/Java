package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Numero_Divisivel_Por_5_e_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Informe o número a ser testado:");
        numero = teclado.nextInt();
        if ((numero%5) == 0 && (numero%7) == 0) {
            System.out.println("O número é divisível por 5 e por 7 ao mesmo tempo");
        } else {
            System.out.println("O número não é divisível por 5 e por 7 ao mesmo tempo");
        }
        teclado.close();
    }
}
