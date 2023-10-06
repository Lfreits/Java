package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Media_Pares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int[] numeros = new int[10];
        double soma = 0, media;
        for (int aux = 0; aux < 10; aux++){
            System.out.println("Informe o "+(aux+1)+"° número inteiro: ");
            numeros[aux] = teclado.nextInt();
            if (numeros[aux] % 2 == 0){
                cont++;
            }
        }
        System.out.println();
        for (int aux = 0; aux < 10; aux++){
            if (numeros[aux] % 2 == 0){
                soma += numeros[aux];
                System.out.print(numeros[aux]+", ");
            }
        }
        media = soma/cont;
        System.out.println("\nMédia dos números pares: "+media);
        teclado.close();
    }
}
