package C02_Comandos_de_IO_SCANNER_E_PRINT;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class FormataArquivo {
    public static void main(String[] args) {
        String nome, cpf, identidade, titulo, carteira, empresa;
                double salario;
                Scanner arquivo = new Scanner(
                        FormataArquivo.class.getResourceAsStream("DadosC4EX5.txt"));
                nome = arquivo.nextLine();
                cpf = arquivo.nextLine();
                identidade = arquivo.nextLine();
                titulo = arquivo.nextLine();
                carteira = arquivo.nextLine();
                empresa = arquivo.nextLine();
                salario = arquivo.nextDouble();
                JOptionPane.showMessageDialog(null,
                        "FICHA FUNCIONAL DE "+nome+"\n\nDocumentos:\nCPF ................"+cpf+"\nC.I. .............."+identidade+"\nTítulo de eleitor ..........."+titulo+"\nCarteira de motorista .........."+carteira+"\n\nEmpresa: "+empresa+"\nSalário:"+salario);
                arquivo.close();
    }
}
