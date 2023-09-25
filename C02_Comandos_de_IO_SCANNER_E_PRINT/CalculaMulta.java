package C02_Comandos_de_IO_SCANNER_E_PRINT;

import java.util.Scanner;
public class CalculaMulta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double quantidade_menor, quantidade_maior, multa_menor, multa_media, multa_maior;
        System.out.println("Informe a quantidade máxima de poluente para menor multa: ");
        quantidade_menor = teclado.nextDouble();
        System.out.println("Informe o preço da multa menor: ");
        multa_menor = teclado.nextDouble();
        System.out.println("Informe a quantidade máxima de poluente para multa média: ");
        quantidade_maior = teclado.nextDouble();
        System.out.println("Informe o valor da multa média: ");
        multa_media = teclado.nextDouble();
        System.out.println("Informe o valor da multa maior: ");
        multa_maior = teclado.nextDouble();
        System.out.println("Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println("\nAté "+quantidade_menor+" multa de R$"+multa_menor);
        System.out.println("Entre "+quantidade_menor+" e "+quantidade_maior+" multa de R$"+multa_media);
        System.out.println("Acima de "+quantidade_maior+" multa de R$"+multa_maior+" por poluente emitido");
        teclado.close();
    }
}
