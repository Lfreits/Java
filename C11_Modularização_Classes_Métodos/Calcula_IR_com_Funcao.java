package C11_Modularização_Classes_Métodos;

import java.util.Scanner;

public class Calcula_IR_com_Funcao {
    public static void main(String[] args) {
        int dependentes;
        double salario, ir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o salário da pessoa: ");
        salario = teclado.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        dependentes = teclado.nextInt();
        ir = ir(salario,dependentes);
        System.out.println("Valor do imposto de renda: "+ir);
        teclado.close();
    }
    public static double ir(double salario, int dependentes){
        double ir = 0;
        salario -= (150*dependentes);
        if (salario <= 1000){
        } else if (salario <= 5000) {
            ir = salario*0.10;
        } else if (salario <= 10000) {
            ir = salario*0.15;
        } else {
            ir = salario*0.20;
        }
        return ir;
    }
}
