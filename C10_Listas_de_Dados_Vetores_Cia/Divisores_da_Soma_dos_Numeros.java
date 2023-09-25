package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Divisores_da_Soma_dos_Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vet = new int[10];
        double soma = 0;
        for (int aux = 0; aux < vet.length; aux++){
            System.out.println("Informe o valor do "+(aux+1)+"° número: ");
            vet[aux] = teclado.nextInt();
            soma += vet[aux];
        }
        System.out.println("Números que são divisores da soma de todos os números lidos: ");
        for (int aux = 0; aux < vet.length; aux++){
            if (soma % vet[aux] == 0){
                System.out.println(vet[aux]);
            }
        }
        teclado.close();
    }
}
