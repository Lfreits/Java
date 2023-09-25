package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Info_Cidades {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                Info_Cidades.class.getResourceAsStream("C10EX08.txt")
        );
        String nome, nomeMenor = null;
        int cont = 0, somaEleitores = 0, somaPop = 0, populacao, popMenor = 0, somaH = 0, qtdMmaior = 0, numEleitores, qtdM, qtdH, qtdCid = 0;
        double percentEleit = 0;
        do {
            nome = arquivo.nextLine();
            populacao = arquivo.nextInt();
            numEleitores = arquivo.nextInt();
            qtdM = arquivo.nextInt();
            qtdH = arquivo.nextInt();
            arquivo.nextLine();
            somaEleitores += numEleitores;
            cont++;
            somaPop += populacao;
            if (cont == 1 || popMenor > populacao){
                popMenor = populacao;
                nomeMenor = nome;
            }
            if (qtdM > qtdH){
                qtdMmaior++;
            }
            System.out.println("População da cidade "+nome+" = "+populacao);
            if (qtdH+qtdM != populacao){
                System.out.println("SOMA DAS MULHERES + HOMENS DA CIDADE "+nome+" É DIFERENTE DO NÙMERO DA POPULAÇÂO");
            }
            qtdCid++;
            somaH += qtdH;
        } while (!nome.equalsIgnoreCase("Zimbabue de Minas"));
        percentEleit = (somaEleitores*100.0)/somaPop;
        System.out.println("\nRESULTADOS FINAIS: ");
        System.out.println("Quantidade total de cidades do estado: "+qtdCid);
        System.out.println("População total = "+somaPop);
        System.out.println("Percentual de eleitores total = "+percentEleit+"%");
        System.out.println("Quantidade de cidades cuja população tem mais mulheres = "+qtdMmaior);
        System.out.println("Média de homens = "+(somaH/cont));
        System.out.println("Cidade com menor população = "+nomeMenor);
    }
}
