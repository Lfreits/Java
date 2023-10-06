package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Conceito_Alunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] vetNome = new String[5];
        double[] vetNota = new double[5];
        char[] vetConceito = new char[5];
        for (int aux = 0; aux < vetNome.length; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° aluno: ");
            vetNome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do aluno "+vetNome[aux]+":");
            vetNota[aux] = teclado.nextDouble();
            teclado.nextLine();
            if (vetNota[aux] <= 30){
                vetConceito[aux] = 'D';
            } else if (vetNota[aux] <= 60) {
                vetConceito[aux] = 'C';
            } else if (vetNota[aux] < 80) {
                vetConceito[aux] = 'B';
            } else {
                vetConceito[aux] = 'A';
            }
        }
        for (int aux = 0; aux < vetNota.length; aux++){
            System.out.println("O aluno "+vetNome[aux]+" ficou com o conceito "+vetConceito[aux]);
        }
        teclado.close();
    }
}
