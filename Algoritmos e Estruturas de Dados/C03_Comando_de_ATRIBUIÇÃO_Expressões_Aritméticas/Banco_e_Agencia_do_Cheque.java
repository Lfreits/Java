package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Banco_e_Agencia_do_Cheque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cheque, banco_comeco, agencia_meio, sequencial_final;
        System.out.println("Informe o número do cheque:");
        cheque = teclado.nextInt();
        banco_comeco = (cheque/1000000);
        agencia_meio = ((cheque/1000)%1000);
        sequencial_final = (cheque%1000);
        System.out.println("Banco = "+banco_comeco);
        System.out.println("Agência = "+agencia_meio);
        System.out.println("Sequêncial final = "+sequencial_final);
        teclado.close();
    }
}
