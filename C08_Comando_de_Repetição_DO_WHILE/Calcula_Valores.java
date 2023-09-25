package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Calcula_Valores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0, media, multa = 0, valor, valorMulta = 0;
        int cont = 0;
        do {
            System.out.println("Informe um valor financeiro: ");
            valor = teclado.nextDouble();
            if (valor == -1){
                break;
            }
            multa = valor * 0.1;
            valorMulta = valor+multa;
            soma += multa;
            cont++;
            System.out.println("Multa = "+(valorMulta-valor));
        } while (valor != -1);
            media = soma/cont;
        System.out.println("\nMédia = "+media);
        teclado.close();
    }
}
