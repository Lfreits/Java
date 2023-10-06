package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Peso_Ideal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso_minimo, peso_maximo, altura;
        String nome;
        System.out.println("Informe seu nome:");
        nome = teclado.nextLine();
        System.out.println("Informe a altura da pessoa:");
        altura = teclado.nextDouble();
        peso_minimo = (20*Math.pow(altura,2));
        peso_maximo = (25*Math.pow(altura,2));
        System.out.println(nome+", esse é seu peso mínimo para estar dentro da faixa de peso ideal: "+peso_minimo);
        System.out.println(nome+", esse é seu peso máximo para estar dentro da faixa de peso ideal: "+peso_maximo);
        teclado.close();
    }
}
