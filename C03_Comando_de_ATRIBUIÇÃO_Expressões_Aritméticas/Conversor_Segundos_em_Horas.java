package C03_Comando_de_ATRIBUIÇÃO_Expressões_Aritméticas;

import java.util.Scanner;
public class Conversor_Segundos_em_Horas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos_iniciais, segundos, minutos, horas;
        System.out.println("Informe o tempo de duração em segundos");
        segundos_iniciais = teclado.nextInt();
        horas = (segundos_iniciais/3600);
        minutos = ((segundos_iniciais%3600)/60);
        segundos = (segundos_iniciais-(minutos*60)-(horas*3600));
        System.out.println("Horas = "+horas);
        System.out.println("Minutos = "+minutos);
        System.out.println("Segundos = "+segundos);
        teclado.close();
    }
}
