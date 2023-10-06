package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Contar_Aprova_Aluno {
    public static void main(String[] args) {
        double nota;
        int faltas, numAprov = 0, numReprov = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 50; aux++) {
            System.out.println("Informe a nota final do aluno: ");
            nota = teclado.nextDouble();
            System.out.println("Informe o número de faltas do aluno: ");
            faltas = teclado.nextInt();
            if (nota < 0 || faltas < 0) {
                System.out.println("RESPOSTA INVÁLIDA");
                break;
            }
            if (faltas <= 16 && nota >= 65) {
                System.out.println("APROVADO");
                numAprov++;
            } else {
                System.out.println("REPROVADO");
                numReprov++;
            }
        }
        System.out.println("Número de alunos reprovados: "+numReprov);
        System.out.println("Número de alunos aprovados: "+numAprov);
        teclado.close();
    }
}
