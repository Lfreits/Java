package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Eleicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int voto, n1 = 0, n2 = 0, n3 = 0, invalido = 0;
        for (int aux = 1; aux <=100; aux++) {
            System.out.println("Informe o número do seu candidato: ");
            voto = teclado.nextInt();
            if (voto == 1) {
                n1++;
            } else if (voto == 2) {
                n2++;
            } else if (voto == 3) {
                n3++;
            } else {
                System.out.println("NÚMERO INVÁLIDO");
                invalido++;
                break;
            }
        }
        if (n1 > n2 && n1 > n3) {
            System.out.println("O candidato 1 ganhou");
        } else if (n2 > n3) {
            System.out.println("O candidato 2 ganhou");
        } else  if (invalido == 0) {
            System.out.println("O candidato 3 ganhou");
        }
        teclado.close();
    }
}