package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Calcula_IR {
    public static void main(String[] args) {
        double salario, dependentes, liquido, ir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        dependentes = teclado.nextDouble();
        liquido = (salario-(dependentes*60.0));
        ir = (liquido*(15.0/100));
        System.out.println("O valor a ser retido pelo Imposto de Renda é de "+ir);
        teclado.close();
    }
}
