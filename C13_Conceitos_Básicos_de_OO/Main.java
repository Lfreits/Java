package C13_Conceitos_Básicos_de_OO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List <Funcionario> Funcionarios = new ArrayList<>();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, cargo, empresa;
        double salario;
        int idade, cont = 0;
        do {
            cont++;
            System.out.println("Informe o nome do "+(cont)+"° funcionário: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                break;
            }
            System.out.println("Informe o cargo do(a) "+nome+": ");
            cargo = teclado.nextLine();
            System.out.println("Informe a empresa do(a) "+nome+": ");
            empresa = teclado.nextLine();
            System.out.println("Informe o salário do(a) "+nome+": ");
            salario = teclado.nextDouble();
            System.out.println("Informe a idade do(a) "+nome+": ");
            idade = teclado.nextInt();
            teclado.nextLine();
            Funcionarios.add(new Funcionario(nome, cargo, empresa, salario, idade));
        } while (true);
        ImprimirPessoas();
        teclado.close();
    }
    private static void ImprimirPessoas() {
        int qtd = 0;
        System.out.println("Lista de pessoas: \n");
        for (Funcionario f : Funcionarios){
            qtd++;
            f.ImprimeFuncionario();
            System.out.println();
        }
        System.out.println("Quantidade de funcionários na lista: "+qtd);
    }
}
