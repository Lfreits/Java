package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Calcula_PL {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, plbruto, plliquido, ir;
        System.out.println("Informe o salário do empregado: ");
        salario = teclado.nextDouble();
        if (salario <= 300) {
            plbruto = ((salario*0.7)+500);
        } else {
            if (salario > 300 && salario <= 1000) {
                plbruto = ((salario * 0.5) + 200);
            } else {
                plbruto = (salario*0.3);
            }
        }
        ir = (plbruto*0.25);
        plliquido = (plbruto-ir);
        System.out.println("PL Líquido = "+plliquido);
        teclado.close();
    }
}