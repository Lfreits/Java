package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Calcula_Media {
    public static void main(String[] args) {
        double nota1,nota2,nota3, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota 3: ");
        nota3 = teclado.nextDouble();
        nota1 = (nota1*2.0);
        nota2 = (nota2*3.0);
        nota3 = (nota3*5.0);
        resultado = ((nota1+nota2+nota3)/10.0);
        System.out.println("Média final: "+resultado);
        teclado.close();
    }
}
