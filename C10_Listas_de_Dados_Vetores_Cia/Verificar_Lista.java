package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Verificar_Lista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pesquisa;
        String[] nome = new String[10];
        int pos = 0;
        for(int aux = 0; aux < nome.length; aux++){
            System.out.println("Informe o nome da "+(aux+1)+"a pessoa da lista: ");
            nome[aux] = teclado.nextLine();
        }
        System.out.println("Informe de uma pessoa para ver se ela está na fila: ");
        pesquisa = teclado.nextLine();
        for (int aux = 0; aux < nome.length; aux++){
            if (pesquisa.equalsIgnoreCase(nome[aux])){
                pos = aux+1;
                System.out.println("Pessoa se encontra na posição "+(aux+1));
            }
        }
        if (pos == 0){
            System.out.println("Pessoa não se encontra na fila");
        }
        teclado.close();
    }
}
