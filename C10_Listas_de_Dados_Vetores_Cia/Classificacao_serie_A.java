package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Classificacao_serie_A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String equipe, equipeTemp, pesquisa;
        int pontuacao, pontuacaoTemp, pos;
        List<String> equipes = new ArrayList<>();
        List<Integer> pontuacoes = new ArrayList<>();
        for (int aux = 0; aux < 20; aux++) {
            System.out.println("Informe o nome da equipe: ");
            equipe = teclado.nextLine();
            equipes.add(equipe);
            System.out.println("Informe a pontuação final do(a) " + equipe + ": ");
            pontuacao = teclado.nextInt();
            pontuacoes.add(pontuacao);
            teclado.nextLine();
        }
        for (int aux = 0; aux < equipes.size()-1; aux++) {
            for (int x = 0; x < equipes.size()-1-aux; x++) {
                if (pontuacoes.get(x) < (pontuacoes.get(x+1))) {
                    equipeTemp = equipes.get(x);
                    equipes.set(x, equipes.get(x + 1));
                    equipes.set(x + 1, equipeTemp);
                    pontuacaoTemp = pontuacoes.get(x);
                    pontuacoes.set(x, pontuacoes.get(x + 1));
                    pontuacoes.set(x + 1, pontuacaoTemp);
                }
            }
        }
        System.out.println("Informe o nome de uma equipe para pesquisar a posição dela: ");
        pesquisa = teclado.nextLine();
        for (int aux = 0; aux < equipes.size(); aux++) {
            if (pesquisa.equalsIgnoreCase(equipes.get(aux))) {
                pos = aux + 1;
                if (pos <= 4) {
                    System.out.println(equipes.get(aux) + " está na posição " + pos + " e está classificado para a Copa Libertadores");
                } else if (pos <= 12) {
                    System.out.println(equipes.get(aux) + " está na posição " + pos + " e está classificado para a Copa Sul-americana");
                } else if (pos >= 17) {
                    System.out.println(equipes.get(aux) + " está na posição " + pos + " e está rebaixado");
                } else {
                    System.out.println(equipes.get(aux) + " está na posição " + pos);
                }
            }
        }
        teclado.close();
    }
}
