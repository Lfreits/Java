package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Exercicio_Engenheiros {
    public static void main(String[] args) {
        String nome, cargoMenor = null, nomeMenor = null;
        char cargo;
        double salarioMenor = 0, salario, somaAdm = 0, mediaAdm;
        int contOutros5K = 0, contAdm = 0, rep, contSalarioMaior = 0, minC = 2500, minP = 4650, minO = 3200, minA = 5100, minX = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de engenheiros pesquisados: ");
        rep = teclado.nextInt();
        Scanner arquivo = new Scanner(
                Exercicio_Engenheiros.class.getResourceAsStream("c08ex31.txt")
        );
        for (int aux = 1; aux <= rep; aux++){
            nome = arquivo.nextLine();
            cargo = arquivo.next().charAt(0);
            salario = arquivo.nextDouble();
            arquivo.nextLine();
            if (cargo == 'c' || cargo == 'C'){
                if (salario < minC){
                    System.out.println(nome+" ESTÁ RECEBENDO ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    contSalarioMaior++;
                }
            }
            if (cargo == 'p' || cargo == 'P'){
                if (salario < minP){
                    System.out.println(nome+" ESTÁ RECEBENDO ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    contSalarioMaior++;
                }
            }
            if (cargo == 'o' || cargo == 'O'){
                if (salario < minO){
                    System.out.println(nome+" ESTÁ RECEBENDO ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    contSalarioMaior++;
                }
            }
            if (cargo == 'a' || cargo == 'A'){
                if (salario < minA){
                    System.out.println(nome+" ESTÁ RECEBENDO ABAIXO DO SALÁRIO MÍNIMO");
                } else {
                    contSalarioMaior++;
                }
                somaAdm += salario;
                contAdm++;
            }
            if (cargo == 'x' || cargo == 'X'){
                if (salario > 5000){
                    contOutros5K++;
                }
            }
            if (aux == 1 || salarioMenor > salario){
                salarioMenor = salario;
                nomeMenor = nome;
                if (cargo == 'c' || cargo == 'C'){
                    cargoMenor = "Engenheiro Calculista";
                }
                if (cargo == 'p' || cargo == 'P'){
                    cargoMenor = "Engenheiro Projetista";
                }
                if (cargo == 'o' || cargo == 'O'){
                    cargoMenor = "Engenheiro de Obra";
                }
                if (cargo == 'a' || cargo == 'A'){
                    cargoMenor = "Engenheiro Adminstrador";
                }
                if (cargo == 'x' || cargo == 'X'){
                    cargoMenor = "Outros";
                }
            }
        }
        mediaAdm = somaAdm/contAdm;
        System.out.println("Quantidade de engenheiros cujo salário está igual ou acima do salário mínimo de acordo com o cargo: "+contSalarioMaior);
        System.out.println("Média dos salários dos engenheiros de cargo Administrador: "+mediaAdm);
        System.out.println("Quantidade de engenheiros de cargo Outros e que recebmem acima de 5000: "+contOutros5K);
        System.out.println("Engenheiro que recebe o menor salário: "+nomeMenor+", com salário de : "+salarioMenor+", no cargo de : "+cargoMenor);
        teclado.close();
    }
}
