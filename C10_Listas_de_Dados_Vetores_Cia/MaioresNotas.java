package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MaioresNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> notaMaior = new ArrayList<Double>();
        List<String> nomeMaior = new ArrayList<String>();
        String[] nome = new String[8];
        double[] nota = new double[8];
        for (int aux = 0; aux < 8; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° aluno: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do "+nome[aux]+":");
            nota[aux] = teclado.nextDouble();
            teclado.nextLine();
            if (aux == 0 || notaMaior.get(notaMaior.size()-1) == nota[aux]){
                notaMaior.add(nota[aux]);
                nomeMaior.add(nome[aux]);
            }
            if (notaMaior.get(notaMaior.size()-1) < nota[aux]) {
                notaMaior.clear();
                nomeMaior.clear();
                notaMaior.add(nota[aux]);
                nomeMaior.add(nome[aux]);
            }
        }
        System.out.println("Aluno(s) com a maior nota: ");
        for (int aux = 0; aux < notaMaior.size(); aux++){
            System.out.println(nomeMaior.get(aux));
        }
        teclado.close();
    }
}