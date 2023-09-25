package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Tempo_Infeccao_Total {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes = 0, ano = 0, dias = 0;
        double populacao, doentes = 1;
        System.out.println("Informe a população inicial: ");
        populacao = teclado.nextInt();
        while (populacao > doentes) {
            doentes += doentes * (0.3/100);
            dias++;
        }
        while (dias > 365) {
            dias -= 365;
            ano++;
        }
        while (dias > 30) {
            dias -= 30;
            mes++;
        }
        System.out.println("Anos = "+ ano);
        System.out.println("Meses = "+ mes);
        System.out.println("Dias = "+ dias);
        teclado.close();
    }
}
