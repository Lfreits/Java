package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Custo_de_Producao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double bolaTotal, bolaBoa, bolaRuim, precoCaixa, mesesCopa, aluguel, totalCaixas, totalGalpoes, precoTotal;
        System.out.println("Informe a quantidade de bolas fabricadas: ");
        bolaTotal = teclado.nextDouble();
        System.out.println("Informe a quantidade de bolas fabricadas com defeito: ");
        bolaRuim = teclado.nextDouble();
        System.out.println("Informe o preço de uma caixa de papelão: ");
        precoCaixa = teclado.nextDouble();
        System.out.println("Informe quantos meses faltam até a Copa do Mundo: ");
        mesesCopa = teclado.nextDouble();
        System.out.println("Informe o valor mensal do aluguel do galpão: ");
        aluguel = teclado.nextDouble();
        bolaBoa = (bolaTotal-bolaRuim);
        totalCaixas = (bolaBoa/10);
        totalGalpoes = (totalCaixas/850);
        totalGalpoes = Math.ceil(totalGalpoes);
        totalCaixas = Math.ceil(totalCaixas);
        precoTotal = ((totalCaixas*precoCaixa)+(aluguel*totalGalpoes*mesesCopa));
        System.out.printf("Custo total de embalagem e estocagem da produção = %.2f",precoTotal);
        teclado.close();
    }
}
