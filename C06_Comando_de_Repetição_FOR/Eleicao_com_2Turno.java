package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Eleicao_com_2Turno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int voto, n1 = 0, n2 = 0, n3 = 0, invalido = 0, n3N = 0, n2N = 0, n1N = 0;
        for (int aux1 = 1; aux1 <= 100; aux1++) {
            System.out.println("Informe o número do seu candidato: ");
            voto = teclado.nextInt();
            if (voto == 1) {
                n1++;
            } else if (voto == 2) {
                n2++;
            } else if (voto == 3) {
                n3++;
            } else {
                invalido++;
            }
        }
        if (n1 == n2 || n1 == n3 || n2 == n3) {
            if (n1 > n3 && n2 > n3) {
                n3N = 1;
            } else if (n1 > n2 && n3 > n2) {
                n2N = 1;
            } else if (n2 > n1 && n3 > n1 ) {
                n1N = 1;
            }
            n1 = 0;
            n2 = 0;
            n3 = 0;
            invalido = 0;
            System.out.println("Segundo turno: ");
            for (int aux2 = 1; aux2 <= 100; aux2++) {
                System.out.println("Informe o número do seu candidato: ");
                voto = teclado.nextInt();
                if (voto == 1) {
                    n1++;
                } else if (voto == 2) {
                    n2++;
                } else if (voto == 3) {
                    n3++;
                } else {
                    invalido++;
                }
            }
            if(n3N == 1) {
                invalido = invalido+n3;
            }
            if(n2N == 1) {
                invalido = invalido+n2;
            }
            if(n1N == 1) {
                invalido = invalido+n1;
            }
        }
        if (invalido > (n1 + n2 + n3)) {
            System.out.println("Votação está ANULADA");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("O candidato 1 ganhou");
        } else if (n2 > n3) {
            System.out.println("O candidato 2 ganhou");
        } else if (invalido == 0) {
            System.out.println("O candidato 3 ganhou");
        }
        System.out.println("Votos nulos: " + invalido);
        System.out.println("Votos no canditado 1: " + n1);
        System.out.println("Votos no candidato 2: " + n2);
        System.out.println("Votos no candidato 3: " + n3);
        teclado.close();
    }
}