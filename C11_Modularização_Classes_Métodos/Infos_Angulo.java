package C11_Modularização_Classes_Métodos;

import java.util.Scanner;
public class Infos_Angulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo, seno, cosseno, tangente, arcoSeno, arcoCosseno, arcoTangente;
        System.out.println("Informe o valor do angulo: ");
        angulo = teclado.nextDouble();
        angulo *= (Math.PI/180);
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        arcoSeno = 1/seno;
        arcoCosseno = 1/cosseno;
        arcoTangente = 1/tangente;
        System.out.println("Seno = "+seno);
        System.out.println("Cosseno = "+cosseno);
        System.out.println("Tangente = "+tangente);
        System.out.println("Arco seno = "+arcoSeno);
        System.out.println("Arco cosseno = "+arcoCosseno);
        System.out.println("Arco tangente = "+arcoTangente);
        teclado.close();
    }
}
