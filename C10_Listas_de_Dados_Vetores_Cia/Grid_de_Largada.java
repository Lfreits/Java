package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;

public class Grid_de_Largada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[] vet = new int[20];
        for (int aux = 0; aux < vet.length; aux++){
            System.out.println("Informe o número do corredor que chegou em "+(aux+1)+"° lugar: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vet.length-10; aux++){
            System.out.println("A dupla que largará em "+(aux+1)+"° será o corredor número"+vet[aux]+" e o corredor número"+vet[aux+10]);
        }
        teclado.close();
    }
}
