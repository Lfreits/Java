package C02_Comandos_de_IO_SCANNER_E_PRINT;

import java.util.Scanner;
public class FormataNome_Idade {
    public static void main(String[] args) {
        String Nome, Sobrenome, UltimoNome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        Nome = teclado.nextLine();
        System.out.println("Informe seu segundo nome: ");
        Sobrenome = teclado.nextLine();
        System.out.println("Informe seu último nome: ");
        UltimoNome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();
        System.out.println(Sobrenome+","+" "+Nome+" "+UltimoNome);
        System.out.println("Idade: "+idade+" anos");
        teclado.close();
    }
}
