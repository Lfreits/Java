package C02_Comandos_de_IO_SCANNER_E_PRINT;

import javax.swing.JOptionPane;

public class NomeIdade_Painel {
    public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInputDialog(null,
                "Qual seu primeiro nome?",
                        "Primeiro nome",
                        JOptionPane.QUESTION_MESSAGE);
        String nome_do_meio = JOptionPane.showInputDialog(null,
        "Qual seu nome do meio?",
                "Nome do meio",
                JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,
        "Qual seu sobrenome?",
                "Sobrenome",
                JOptionPane.QUESTION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null,
        "Qual sua idade?",
                "Idade",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                nome_do_meio+", "+primeiroNome+" "+sobrenome+"\nIdade: "+idade+" anos.",
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
