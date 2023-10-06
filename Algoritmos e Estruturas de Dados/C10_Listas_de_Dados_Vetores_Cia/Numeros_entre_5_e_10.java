package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Numeros_entre_5_e_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int x = 0; x < 10; x++){
            System.out.println("Informe um número inteiro: ");
            numeros[x] = teclado.nextInt();
        }
        System.out.println("\nNúmeros maiores que 5 e menores que 10: \n");
        for (int x = 0; x < 10; x++){
            if(numeros[x] < 10 && numeros[x] > 5){
                System.out.println(numeros[x]);
            }
        }
        teclado.close();
    }
}
