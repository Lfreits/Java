package C13_Conceitos_Básicos_de_OO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aux_Motoboy {
    private static List<Motoboy> Motoboys = new ArrayList<>();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, cargo, empresa, placaMoto;
        double salario;
        int idade, cont = 0, qtdEntregas;
        do {
            cont++;
            System.out.println("Informe o nome do "+(cont)+"° motoboy: ");
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
            System.out.println("Informe a quantidade de entregas no mês do "+nome+": ");
            qtdEntregas = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Informe a placa da moto do "+nome+":");
            placaMoto = teclado.nextLine();
            Motoboys.add(new Motoboy(nome, cargo, empresa, salario, idade, qtdEntregas, placaMoto));
        } while (true);
        ImprimirMotoboys();
        teclado.close();
    }
    public static void ImprimirMotoboys(){
        int qtd = 0;
        System.out.println("Lista de pessoas: \n");
        for (Motoboy m : Motoboys){
            qtd++;
            m.ImprimeMotoboy();
            System.out.println();
        }
        System.out.println("Quantidade de motoboys na lista: "+qtd);
    }
}
