package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Formula_Bhaskara {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a,b,c,xpositivo, xnegativo, delta;
        System.out.println("Informe o valor de A:");
        a = teclado.nextDouble();
        System.out.println("Informe o valor de B:");
        b = teclado.nextDouble();
        System.out.println("Informe o valor de C:");
        c = teclado.nextDouble();
        delta = (Math.pow(b,2)-(4*a*c));
        if (delta < 0) {
            System.out.println("Não existem raízes");
        }
        xpositivo = ((-b+Math.sqrt(delta))/(2*a));
        if (delta == 0) {
            System.out.println("Raíz = "+xpositivo);
        }
        xnegativo = ((-b-Math.sqrt(delta))/(2*a));
        if (delta > 0) {
            System.out.println("Primeira raíz = "+xpositivo+"\nSegunda raíz = "+xnegativo);
        }
        teclado.close();
    }
}
