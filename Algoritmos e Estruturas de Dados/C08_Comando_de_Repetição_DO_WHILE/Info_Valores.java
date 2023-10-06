package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;

public class Info_Valores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, valor = 0, media;
        int cont = 0, qtd = 0;
        do {
            System.out.println("Informe o valor recebido: ");
            valor = teclado.nextDouble();
            if (valor == 0){
                break;
            }
            soma += valor;
            if (valor > 1000){
                cont++;
            }
            qtd++;
        } while (valor != 0);
        media = soma/qtd;
        teclado.close();
        System.out.println("Média dos valores recebidos: "+media);
        System.out.println("Valor total recebido: "+soma);
        System.out.println("Quantidade de valores acima de 1000: "+cont);
    }
}
