package C12_Criando_Projetos.C14EX01;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String[] botoes = {"Calcular área do círculo", "Calcula IMC", "Calcular duração", "Frase na vertical", "Converter Celsius"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Informe a opção desejada: ",
                "Selecione um programa",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botoes,
                "Calcular Área do círculo"
        );
        if (resposta == 0) {
            String raioString = JOptionPane.showInputDialog(null,
                    "Informe o raio do círculo: ",
                    "Calcular o raio do círculo",
                    JOptionPane.QUESTION_MESSAGE);
            double raio = Double.valueOf(raioString);
            JOptionPane.showMessageDialog(null,
                    "Área do círculo = " + CalculaArea.CalculaAreaCirculo(raio));
        }
        if (resposta == 1) {
            String alturaString = JOptionPane.showInputDialog(null,
                    "Informe a altura da pessoa: ",
                    "Calcular IMC",
                    JOptionPane.QUESTION_MESSAGE);
            double altura = Double.parseDouble(alturaString);
            String pesoString = JOptionPane.showInputDialog(null,
                    "Informe o peso da pessoa",
                    "Calcular IMC",
                    JOptionPane.QUESTION_MESSAGE);
            double peso = Double.parseDouble(pesoString);
            CalculaIMC.CalculaIMC(peso, altura);
        }
        if (resposta == 2) {
            String horaInicialString = JOptionPane.showInputDialog(null,
                    "Informe a hora inicial (Sem os minutos): ",
                    "Duração",
                    JOptionPane.QUESTION_MESSAGE);
            int horaInicial = Integer.parseInt(horaInicialString);
            System.out.println("Informe os minutos do horário que o jogo começou: ");
            String minutoInicialString = JOptionPane.showInputDialog(null,
                    "Informe os minutos do horário que o jogo começou: ",
                    "Duração",
                    JOptionPane.QUESTION_MESSAGE);
            int minutoInicial = Integer.parseInt(minutoInicialString);
            String horaFinalString = JOptionPane.showInputDialog(null,
                    "Informe a hora que o jogo terminou (Sem os minutos): ",
                    "Duração",
                    JOptionPane.QUESTION_MESSAGE);
            int horaFinal = Integer.parseInt(horaFinalString);
            String minutoFinalString = JOptionPane.showInputDialog(null,
                    "Informe os minutos do horário que o jogo terminou: ",
                    "Duração",
                    JOptionPane.QUESTION_MESSAGE);
            int minutoFinal = Integer.parseInt(minutoFinalString);
            JOptionPane.showMessageDialog(null,
                    "Duração: " + Duracao.duracao(horaFinal, horaInicial, minutoFinal, minutoInicial));
        }
        if (resposta == 3) {
            String frase = JOptionPane.showInputDialog(null,
                    "Informe a frase para ser impressa na vertical",
                    "Frase na vertical",
                    JOptionPane.QUESTION_MESSAGE);
            ImprimirVertical.ImprimirVertical(frase);
        }
        if (resposta == 4) {
            String celsiusString = JOptionPane.showInputDialog(null,
                    "Informe a temperatura em Celsius: ",
                    "Converter Celsius",
                    JOptionPane.QUESTION_MESSAGE);
            double celsius = Double.parseDouble(celsiusString);
            JOptionPane.showMessageDialog(null,
                    ConverterCelsius.ConverterCelsius(celsius));
        }
    }
}