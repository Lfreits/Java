package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Custos_Fabricacao {
    public static void main(String[] args) {
        String nome;
        int qtd;
        double taxa, precoUnitario, bdi, custoParcial, custoTotal = 0, precoFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a taxa de BDI: ");
        bdi = teclado.nextDouble();
        teclado.nextLine();
        do {
            System.out.println("Informe o nome do material: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                break;
            }
            System.out.println("Informe a quantidade utilizada desse material: ");
            qtd = teclado.nextInt();
            System.out.println("Informe o preço unitário do material: ");
            precoUnitario = teclado.nextDouble();
            teclado.nextLine();
            custoParcial = qtd*precoUnitario;
            custoTotal += custoParcial;
            System.out.println("Custo parcial = "+custoParcial);
        } while (nome != "FIM");
        taxa = custoTotal*(bdi/100);
        precoFinal = custoTotal + taxa;
        System.out.println("Preço final = "+precoFinal);
        teclado.close();
    }
}
