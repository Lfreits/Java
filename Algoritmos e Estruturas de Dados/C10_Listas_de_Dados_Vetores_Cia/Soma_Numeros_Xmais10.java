package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Soma_Numeros_Xmais10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[20];
        for (int aux = 0; aux < vet.length; aux++){
            System.out.println("Informe o "+(aux+1)+"° número: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vet.length-10; aux++){
            System.out.println("Soma "+(aux+1)+": "+(vet[aux]+vet[aux+10]));
        }
        teclado.close();
    }
}
