package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Contar_Aluno_Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade, contMenor = 0, contMaior = 0;
        for (int aux = 1; aux <= 50; aux++) {
            System.out.println("Informe o nome do aluno: ");
            nome = teclado.nextLine();
            System.out.println("Informe a idade do aluno: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.println("NOME = "+nome+"  IDADE = "+idade);
            if (idade <= 18){
                contMenor++;
            } else {
                contMaior++;
            }
        }
        System.out.println("\nAté 18 -> "+contMenor);
        System.out.println("Acima de 18 -> "+contMaior);
        teclado.close();
    }
}
