package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Comparacao_de_Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int[] numeros = new int[10];
        double soma = 0, media;
        for (int aux = 0; aux < numeros.length; aux++){
            System.out.println("Informe o "+(aux+1)+"° número inteiro: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numeros.length-1; aux++){
            if (numeros[aux] > numeros[9]){
                soma += numeros[aux];
                cont++;
                System.out.println(numeros[aux]);
            }
        }
        media = soma/cont;
        System.out.println("Média dos números maiores que "+numeros[9]+": "+media);
        teclado.close();
    }
}
