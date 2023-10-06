package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Conferir_Bilhete_Premiado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int premiado;
        int[] bilhetes = new int[100];
        boolean ganhou = false;
        for (int aux = 0; aux < bilhetes.length; aux++){
            System.out.println("Informe os números do "+(aux+1)+"° bilhete: ");
            bilhetes[aux] = teclado.nextInt();
        }
        System.out.println("Informe o número do bilhete premiado: ");
        premiado = teclado.nextInt();
        for (int aux = 0; aux < bilhetes.length; aux++){
            if (premiado == bilhetes[aux]){
                ganhou = true;
                System.out.println("Você ganhou! O bilhete premiado é o "+(aux+1)+"° bilhete");
            }
        }
        if (!ganhou){
            System.out.println("Não foi dessa vez... Nenhum dos seus bilhetes foram premiados");
        }
        teclado.close();
    }
}
