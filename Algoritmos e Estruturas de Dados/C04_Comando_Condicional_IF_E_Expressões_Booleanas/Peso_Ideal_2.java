package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Peso_Ideal_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sexo;
        double altura, peso;
        System.out.println("Informe o seu sexo (F ou M):");
        sexo = teclado.nextLine();
        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();
        if (sexo.equalsIgnoreCase("M")) {
            peso = ((72.7*altura)-58);
            System.out.printf("Peso ideal: %.3f", peso);
        } else {
            if (sexo.equalsIgnoreCase("F")) {
                peso = ((62.1 * altura) - 44.7);
                System.out.printf("Peso ideal: %.3f", peso);
            } else {
                    System.out.println("Resposta Inválida");
                }
            }
        teclado.close();
    }
}
