package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Numeros_Divisiveis_por_5_e_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int x = 0; x < 10; x++) {
            System.out.println("Informe um número inteiro: ");
            numeros[x] = teclado.nextInt();
        }
        System.out.println("\nNúmeros divisíveis por 5 e 7 ao mesmo tempo:");
        for (int x = 0; x < 10; x++){
            if (numeros[x] % 5 == 0 && numeros[x] % 7 == 0){
                System.out.println(numeros[x]);
            }
        }
        teclado.close();
    }
}