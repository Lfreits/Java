package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;

public class Maiores_Cidades_da_Lista {
    public static void main(String[] args) {
        String tempNome, tempEstado;
        double tempPopulacao;
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[100];
        double[] populacao = new double[100];
        String[] estado = new String[100];
        for (int aux = 0; aux < nome.length; aux++) {
            System.out.println("Informe o nome da " + (aux + 1) + "° cidade: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a população de " + nome[aux] + ": ");
            populacao[aux] = teclado.nextDouble();
            System.out.println("Informe o estado em que " + nome[aux] + " está localizado(a): ");
            teclado.nextLine();
            estado[aux] = teclado.nextLine();
        }
        for (int aux = 0; aux < nome.length; aux++) {
            for (int x = 0; x < nome.length-1; x++) {
                if (populacao[x] > populacao[x+1]) {
                    tempNome = nome[x];
                    nome[x] = nome[x + 1];
                    nome[x + 1] = tempNome;
                    tempPopulacao = populacao[x];
                    populacao[x] = populacao[x + 1];
                    populacao[x + 1] = tempPopulacao;
                    tempEstado = estado[x];
                    estado[x] = estado[x + 1];
                    estado[x + 1] = tempEstado;
                }
            }
        }
        System.out.println("As 10 cidades com maiores populações da lista: ");
        for (int aux = 0; aux < nome.length; aux++){
            System.out.println(nome[aux]+", com "+populacao[aux]+" habitantes, localizado no estado "+estado[aux]);
        }
        teclado.close();
    }
}
