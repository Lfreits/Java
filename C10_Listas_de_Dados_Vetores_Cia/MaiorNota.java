package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class MaiorNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeMaior = null;
        double notaMaior = 0;
        String nome[] = new String[50];
        double nota[] = new double[50];
        for (int aux = 0; aux < 50; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do "+nome[aux]+":");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();
            if (aux == 0 || notaMaior < nota[aux]){
                notaMaior = nota[aux];
                nomeMaior = nome[aux];
            }
        }
        System.out.println("Nome do aluno que obteve a maior nota: "+nomeMaior);
        teclado.close();
    }
}