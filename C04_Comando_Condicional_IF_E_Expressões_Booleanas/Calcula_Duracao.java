package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Calcula_Duracao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicial, horaFinal, minutoInicial, minutoFinal, duracaoMinuto, duracaoHora;
        System.out.println("Informe a hora inicial do jogo (Sem os minutos): ");
        horaInicial = teclado.nextInt();
        System.out.println("Informe os minutos do horário que o jogo começou: ");
        minutoInicial = teclado.nextInt();
        System.out.println("Informe a hora final do jogo (Sem os minutos): ");
        horaFinal = teclado.nextInt();
        System.out.println("Informe os minutos do horário que o jogo terminou: ");
        minutoFinal = teclado.nextInt();
        duracaoHora = (horaFinal-horaInicial);
        duracaoMinuto = (minutoFinal-minutoInicial);
        if (duracaoHora <0) {
            duracaoHora = (duracaoHora+23);
        }
        if (duracaoMinuto<0) {
            duracaoMinuto = (duracaoMinuto+60);
            duracaoHora = (duracaoHora-1);
        }
        System.out.println("O jogo durou "+duracaoHora+" horas e "+duracaoMinuto+" minutos");
        teclado.close();
    }
}
