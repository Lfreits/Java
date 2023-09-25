package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Media_dos_Alunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, media;
        String[] nome = new String[50];
        double[] nota = new double[50];
        for (int aux = 0; aux < 50; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do "+nome[aux]+":");
            nota[aux] = teclado.nextDouble();
            soma += nota[aux];
            teclado.nextLine();
        }
        media = soma/50;
        System.out.println();
        for (int aux = 0; aux < 50; aux++){
            if (nota[aux] > media){
                System.out.println("Nota do "+nome[aux]+" ficou acima da média");
                teclado.close();
            }
        }
    }
}
