package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Simulador_de_Investimento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double capital_aplicado, taxa_diaria, numero_de_dias, rendimento, imposto_de_renda, valor_a_ser_resgatado;
        System.out.println("Informe o capital aplicado: ");
        capital_aplicado = teclado.nextDouble();
        System.out.println("Informe o número de dias: ");
        numero_de_dias = teclado.nextDouble();
        System.out.println("Informe a taxa diária: ");
        taxa_diaria = teclado.nextDouble();
        taxa_diaria = (taxa_diaria/100);
        rendimento = (capital_aplicado * taxa_diaria * numero_de_dias);
        imposto_de_renda = (0.15 * rendimento);
        valor_a_ser_resgatado = (capital_aplicado + rendimento - imposto_de_renda - 10);
        System.out.printf("Rendimento = %.2f",rendimento);
        System.out.printf("\nImposto de renda = %.2f",imposto_de_renda);
        System.out.printf("\nValor resgatado = %.2f",valor_a_ser_resgatado);
        teclado.close();
    }
}
