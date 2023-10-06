package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Contar_Aluno_Idade_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, soma12 = 0, soma30 = 0, soma = 0;
        String nome;
        double media;
        for (int aux = 1; aux <= 50; aux++) {
            System.out.println("Informe o nome do aluno: ");
            nome = teclado.nextLine();
            System.out.println(nome+", informe sua idade: ");
            idade = teclado.nextInt();
            if (idade <= 12) {
                soma12 = soma12++;
            } else if (idade > 30) {
                soma30 = soma30++;
            }
            soma += idade;
            teclado.nextLine();
        }
        media = (float) soma / 50;
        System.out.println("Número de alunos até 12 anos: "+soma12);
        System.out.println("Número de alunos acima de 30 anos: "+soma30);
        System.out.println("Média das idades = "+media);
        teclado.close();
    }
}