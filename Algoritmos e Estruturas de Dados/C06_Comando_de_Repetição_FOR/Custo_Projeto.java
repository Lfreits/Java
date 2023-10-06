package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Custo_Projeto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome, nomeMaior = null;
        double preco, soma = 0, media, precoMaior = 0;
        int quant, quantRep;
        Scanner arquivo = new Scanner(
                Custo_Projeto.class.getResourceAsStream("c08ex10.txt"));
        quantRep = arquivo.nextInt();
        arquivo.nextLine();
        for (int aux = 1; aux <= quantRep; aux++) {
            nome = arquivo.nextLine();
            quant = arquivo.nextInt();
            preco = arquivo.nextDouble();
            arquivo.nextLine();
            soma += preco*quant;
            if (aux == 1 || precoMaior < preco){
                precoMaior = preco;
                nomeMaior = nome;
            }
        }
        media = soma/quantRep;
        System.out.println("Custo total do projeto = "+soma);
        System.out.println("Média dos custos parciais = "+media);
        System.out.println("Nome do insumo de maior custo parcial = "+nomeMaior);
        teclado.close();
    }
}
