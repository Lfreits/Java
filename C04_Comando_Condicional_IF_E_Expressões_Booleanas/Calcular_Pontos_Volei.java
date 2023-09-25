package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Calcular_Pontos_Volei {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String time1, time2;
        double placarTime1, placarTime2;
        System.out.println("Informe o nome da equipe 1: ");
        time1 = teclado.nextLine();
        System.out.println("Informe o nome da equipe 2: ");
        time2 = teclado.nextLine();
        System.out.println("Informe quantos sets o(a) "+time1+" ganhou: ");
        placarTime1 = teclado.nextDouble();
        System.out.println("Informe quantos sets o(a) "+time2+" ganhou: ");
        placarTime2 = teclado.nextDouble();
        if (placarTime1 == 3) {
            if (placarTime2 == 2) {
                System.out.println("Pontos "+time1+" = 2\nPontos "+time2+" = 1");
            } else {
                System.out.println("Pontos "+time1+" = 3\nPontos "+time2+" = 0");
            }
        }
        if (placarTime2 == 3) {
            if (placarTime1 == 2) {
                System.out.println("Pontos "+time2+" = 2\nPontos "+time1+" = 1");
            } else {
                System.out.println("Pontos "+time2+" = 3\nPontos "+time1+" = 0");
            }
        }
        teclado.close();
    }
}
