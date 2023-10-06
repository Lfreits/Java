package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        System.out.println("Informe um número inteiro de 1 a 9: ");
        x = teclado.nextInt();
        System.out.println("1 x "+x+" = "+x*1.0);
        System.out.println("2 x "+x+" = "+x*2.0);
        System.out.println("3 x "+x+" = "+x*3.0);
        System.out.println("4 x "+x+" = "+x*4.0);
        System.out.println("5 x "+x+" = "+x*5.0);
        System.out.println("6 x "+x+" = "+x*6.0);
        System.out.println("7 x "+x+" = "+x*7.0);
        System.out.println("8 x "+x+" = "+x*8.0);
        System.out.println("9 x "+x+" = "+x*9.0);
        teclado.close();
    }
}
