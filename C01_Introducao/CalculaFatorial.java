package C01_Introducao;

import java.util.Scanner;

public class CalculaFatorial {
    //Função : Calcular o fatorial de um número
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        long numero = teclado.nextLong();
        long fatorial = 1L;
        for(long contador = 2; contador <=numero; contador++) {
            fatorial = fatorial*contador;
        }
        System.out.println("Fatorial = "+fatorial);
        teclado.close();
    }
}
