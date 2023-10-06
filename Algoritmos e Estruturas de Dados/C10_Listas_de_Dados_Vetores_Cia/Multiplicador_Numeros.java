package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Multiplicador_Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double multiplicador;
        double[] numeros = new double[10];
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.println("Informe o "+(aux+1)+"° número inteiro: ");
            numeros[aux] = teclado.nextInt();
        }
        System.out.println("Informe o multiplicador dos números: ");
        multiplicador = teclado.nextDouble();
        for (int aux = 0; aux < numeros.length; aux++){
            numeros[aux] *= multiplicador;
            System.out.println(numeros[aux]);
        }
        teclado.close();
    }
}
