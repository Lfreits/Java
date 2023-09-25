package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Imprimir_Numero_Vertical {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int n1,n2,n3,n4, tamanhoNumero, numeroInt;
        String numero;
        System.out.println("Informe o número inteiro de 4 dígitos: ");
        numero = teclado.nextLine();
        tamanhoNumero = numero.length();
        if (tamanhoNumero == 4) {
            numeroInt = Integer.valueOf(numero);
            n1 = (numeroInt / 1000);
            n2 = ((numeroInt / 100) % 10);
            n3 = ((numeroInt / 10) % 10);
            n4 = (numeroInt % 10);
            System.out.print(n4);
            System.out.print(n3);
            System.out.print(n2);
            System.out.print(n1);
        } else {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        }
        teclado.close();
    }
}
