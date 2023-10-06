package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Contar_Aprova_Aluno_2 {
    public static void main(String[] args) {
        double nota, soma = 0, media;
        int faltas, numAprov = 0, numReprov = 0, faltas16 = 0;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 3; aux++) {
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
                soma += nota;
            }
            else {
                System.out.println("REPROVADO");
                numReprov++;
                if (faltas > 16){
                    faltas16++;
                }
            }
        }
        media = soma / numAprov;
        System.out.println("Número de alunos reprovados: "+numReprov);
        System.out.println("Número de alunos aprovados: "+numAprov);
        System.out.println("Média das notas dos alunos aprovados: "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas"+faltas16);
        teclado.close();
    }
}