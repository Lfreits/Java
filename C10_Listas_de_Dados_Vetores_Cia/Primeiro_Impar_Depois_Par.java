package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Primeiro_Impar_Depois_Par {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[20];
        List<Integer> numeroPar = new ArrayList<>();
        List<Integer> numeroImpar = new ArrayList<>();
        for(int aux = 0; aux < numeros.length; aux++){
            System.out.println("Informe o "+(aux+1)+"° número inteiro: ");
            numeros[aux] = teclado.nextInt();
            if (aux % 2 == 0){
                numeroPar.add(numeros[aux]);
            }
            if (aux % 2 == 1){
                numeroImpar.add(numeros[aux]);
            }
        }
        for (int aux = 0; aux < numeroPar.size(); aux++){
            System.out.println(numeroPar.get(aux));
        }
        for (int aux = 0; aux < numeroImpar.size(); aux++){
            System.out.println(numeroImpar.get(aux));
        }
        teclado.close();
    }
}