package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Calcula_Progressao {
    public static void main(String[] args) {
        double n = 1;
        int soma = 1, rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de termos da progressão numérica: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++){
            System.out.println(n);
            n = n*2;
            soma += n;
        }
        if (rep != 0){
            soma += 1;
        }
        System.out.println("Soma dos "+rep+" primeiros termos: "+soma);
        teclado.close();
    }
}
