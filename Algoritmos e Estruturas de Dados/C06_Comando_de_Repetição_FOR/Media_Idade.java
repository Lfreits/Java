package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Media_Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        char sexo;
        double somaF = 0, somaM = 0, mediaF, mediaM;
        int idade, rep, contF = 0, contM = 0;
        System.out.println("Informe a quantidade de pessoas que serão introduzidas no sistema: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            teclado.nextLine();
            System.out.println("Informe o nome da pessoa: ");
            nome = teclado.nextLine();
            System.out.println(nome+", informe sua idade: ");
            idade = teclado.nextInt();
            System.out.println(nome+", informe seu sexo: ");
            sexo = teclado.next().charAt(0);
            if (sexo == 'f' || sexo == 'F') {
                contF++;
                somaF += idade;
            } else if (sexo == 'm' || sexo == 'M') {
                contM++;
                somaM += idade;
            }
            System.out.println("Nome = "+nome+"  Idade = "+idade+"  Sexo = "+sexo);
        }
        mediaF = somaF/contF;
        mediaM = somaM/contM;
        System.out.println("Média das idades dos homens = "+mediaM);
        System.out.println("Média das idades das mulheres = "+mediaF);
        teclado.close();
    }
}
