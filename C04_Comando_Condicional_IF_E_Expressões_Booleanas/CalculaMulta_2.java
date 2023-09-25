package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class CalculaMulta_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double poluente, multa;
        System.out.println("Informe a quantidade de poluente emitido:");
        poluente = teclado.nextDouble();
        if (poluente < 1500) {
            multa = 0;
        } else {
            if (poluente >= 1500 && poluente <= 3500) {
                multa = 3000;
            } else {
                multa = (5000*poluente);
            }
        }
        System.out.println("Multa = "+multa);
        teclado.close();
    }
}
