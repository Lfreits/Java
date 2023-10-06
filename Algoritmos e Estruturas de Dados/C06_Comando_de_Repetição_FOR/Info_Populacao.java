package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Info_Populacao {
    public static void main(String[] args) {
        String nome, nomeMenor = null;
        double populacaoMenor = 0, populacao, homens, mulheres, eleitores;
        int cidM = 0, qtdMilh = 0;
        Scanner arquivo = new Scanner(
                Info_Populacao.class.getResourceAsStream("c08ex13.txt"));
        for (int aux = 1; aux <= 858; aux++) {
            nome = arquivo.nextLine();
            populacao = arquivo.nextDouble();
            eleitores = arquivo.nextDouble();
            homens = arquivo.nextDouble();
            mulheres = arquivo.nextDouble();
            arquivo.nextLine();
            System.out.println("\nNome da cidade: "+nome);
            if ((mulheres+homens) != populacao){
                System.out.println("POPULAÇÂO NÂO CORRESPONDE AO NÚMERO DE HOMENS + MULHERES");
            }
            System.out.println("Percentual de eleitores em relação a população: "+((eleitores/populacao)*100.0));
            if (populacao > 1000000){
                qtdMilh++;
            }
            if (mulheres > homens){
                cidM++;
            }
            if (aux == 1 || populacao < populacaoMenor){
                populacaoMenor = populacao;
                nomeMenor = nome;
            }
        }
        System.out.println("\nLetra C) Cidades com mais de 1 milhão de habitantes: "+qtdMilh +
                "\nLetra D) Quantidade de cidades que tem mais mulheres que homens: "+cidM +
                "\nLetra E) Nome da cidade de menor população: "+nomeMenor);
    }
}
