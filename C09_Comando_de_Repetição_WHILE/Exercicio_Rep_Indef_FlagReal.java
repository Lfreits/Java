package C09_Comando_de_Repetição_WHILE;

import java.util.Scanner;
public class Exercicio_Rep_Indef_FlagReal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor, valorMenor = 0, soma = 0, somaB = 0, mediaB;
        int qtdB = 0, qtdP = 0, qtdO = 0, cont = 0;
        String classificacao = null, nome = "nome", nomeMenor = null;
        do {
            cont++;
            System.out.println("Informe o nome do cliente");
            nome = teclado.nextLine();
            System.out.println("Informe o valor da aplicação: ");
            valor = teclado.nextDouble();
            teclado.nextLine();
            soma += valor;
            if (cont == 1 || valor < valorMenor){
                nomeMenor = nome;
                valorMenor = valor;
            }
            if (valor <= 1000){
                classificacao = "Bronze";
                qtdB++;
                somaB += valor;
            }
            if (valor > 1000 && valor <= 5000){
                classificacao = "Prata";
                qtdP++;
            }
            if (valor > 5000){
                classificacao = "Ouro";
                qtdO++;
            }
            System.out.println(nome+", você é um cliente "+classificacao+"!");
        } while (!nome.equalsIgnoreCase("Reynaldo Duarte"));
        mediaB = somaB/qtdB;
        System.out.println("\nRESULTADOS FINAIS");
        System.out.println("Quantidade de clientes bronze: "+qtdB);
        System.out.println("Quantidade de clientes prata: "+qtdP);
        System.out.println("Quantidade de clientes ouro: "+qtdO);
        System.out.println("Média dos valores aplicados dos clientes bronze: "+mediaB);
        System.out.println("Volume total de aplicações: "+soma);
        System.out.println("O nome do cliente que fez a menor aplicação: "+nomeMenor);
        teclado.close();
    }
}
