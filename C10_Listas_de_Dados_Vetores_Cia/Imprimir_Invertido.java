package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Imprimir_Invertido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.println("Informe o "+(aux+1)+"° número da lista: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 9; aux >= 0; aux--){
            System.out.println(numeros[aux]);
        }
        teclado.close();
    }
}
