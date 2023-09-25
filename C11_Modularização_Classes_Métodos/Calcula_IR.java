package C11_Modularização_Classes_Métodos;

import java.util.Scanner;

public class Calcula_IR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dependentes;
        double salario, ir;
        System.out.println("Informe o salário da pessoa: ");
        salario = teclado.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        dependentes = teclado.nextInt();
        salario -= (150*dependentes);
        if (salario <= 1000){
            System.out.println("Valor do imposto de renda: ISENTO");
        } else if (salario <= 5000) {
            ir = salario*0.10;
            System.out.println("Valor do imposto de renda: "+ir);
        } else if (salario <= 10000) {
            ir = salario*0.15;
            System.out.println("Valor do imposto de renda: "+ir);
        } else {
            ir = salario*0.20;
            System.out.println("Valor do imposto de renda: "+ir);
        }
        teclado.close();
    }
}
