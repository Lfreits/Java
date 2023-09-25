package C06_Comando_de_Repetição_FOR;

import javax.swing.JOptionPane;

public class Testes_Salario {
    public static void main(String[] args) {
        int quantA = 0, quantH = 0;
        double maiorSalario = 0, maiorSalarioHomem = 0, menorSalarioHomem = 0;
        String nomeMaior = null;
        for (int aux = 1; aux <= 50; aux++) {
            String nome = JOptionPane.showInputDialog(null,
                    "Informe seu nome",
                    "Nome",
                    JOptionPane.QUESTION_MESSAGE);
            String idade = JOptionPane.showInputDialog(null,
                    "Informe sua idade: ",
                    "Idade",
                    JOptionPane.QUESTION_MESSAGE);
            int idadeInt = Integer.parseInt(idade);
            int sexo = JOptionPane.showOptionDialog(null,
                    "Informe seu sexo: ",
                    "Sexo",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"M", "F"},
                    "M");
            int estadoCivil = JOptionPane.showOptionDialog(null,
                    "Informe seu estado civil: ",
                    "Estado civil",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"C", "S", "O"},
                    "C");
            int corOlhos = JOptionPane.showOptionDialog(null,
                    "Informe a cor dos seus olhos: ",
                    "Cor dos Olhos: ",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"A", "C", "P", "O"},
                    "A");
            int corCabelo = JOptionPane.showOptionDialog(null,
                    "Informe a cor dos seus cabelos: ",
                    "Cor do cabelo",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"L", "P", "C", "R"},
                    "L");
            String salario = JOptionPane.showInputDialog(null,
                    "Informe seu salário: ",
                    "Salário",
                    JOptionPane.QUESTION_MESSAGE);
            double salarioDouble = Double.parseDouble(salario);
            int escolaridade = JOptionPane.showOptionDialog(null,
                    "Informe seu nível de escolaridade: ",
                    "Escolaridade",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"1", "2", "3", "4"},
                    "1");
            if (sexo == 0) {
                quantH++;
            }
            if (corCabelo == 0 && corOlhos == 0 && idadeInt >= 18 && idadeInt <= 25 && estadoCivil == 1 && salarioDouble > 10000 && escolaridade == 3) {
                quantA++;
            }
            if (aux == 1 || salarioDouble > maiorSalario) {
                maiorSalario = salarioDouble;
                nomeMaior = nome;
            }
            if (quantH == 1 || salarioDouble > maiorSalarioHomem && sexo == 0) {
                maiorSalarioHomem = salarioDouble;
            }
            if (quantH == 1 || salarioDouble < menorSalarioHomem && sexo == 0) {
                menorSalarioHomem = salarioDouble;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Letra A) " + quantA + "\nLetra B) " + nomeMaior + "\nLetra C) " + (maiorSalarioHomem - menorSalarioHomem),
                "Respostas",
                JOptionPane.INFORMATION_MESSAGE);
    }
}