package C02_Comandos_de_IO_SCANNER_E_PRINT;

import java.util.Scanner;
public class FormataDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, CPF, identidade, titulo_de_eleitor, carteira_de_motorista, nome_da_empresa;
        double salario;
        System.out.println("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Insira seu CPF: ");
        CPF = teclado.nextLine();
        System.out.println("Insira o número da sua identidade: ");
        identidade = teclado.nextLine();
        System.out.println("Insira o número do seu título de eleitor: ");
        titulo_de_eleitor = teclado.nextLine();
        System.out.println("Insira o número de sua carteira de motorista: ");
        carteira_de_motorista = teclado.nextLine();
        System.out.println("Insira o nome da empresa que você trabalha: ");
        nome_da_empresa = teclado.nextLine();
        System.out.println("Insira o seu salário: ");
        salario = teclado.nextDouble();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println("\nDocumentos: ");
        System.out.println("CPF ......................... "+CPF);
        System.out.println("C.I. ........................ "+identidade);
        System.out.println("Título de eleitor ..........."+titulo_de_eleitor);
        System.out.println("Carteira de motorista ......."+carteira_de_motorista);
        System.out.println("\nEmpresa: "+nome_da_empresa);
        System.out.println("Salário: R$"+salario);
        teclado.close();
    }

}
