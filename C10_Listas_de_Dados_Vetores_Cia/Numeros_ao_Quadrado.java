package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Numeros_ao_Quadrado {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int[] numeros = new int[10];
        for (int x = 0; x < 10; x++){
            numeros[x] = (int) Math.pow(x+1,2);
        }
        for (int x = 0; x < 10; x++){
            System.out.println(numeros[x]);
        }
        teclado.close();
    }
}
