package C12_Criando_Projetos.C14EX01;
import javax.swing.JOptionPane;
public class CalculaIMC {
    public static void CalculaIMC(double peso, double altura) {
        double imc;
        imc = (peso/Math.pow(altura,2));
        if (imc < 18) {
            JOptionPane.showMessageDialog(null,
                    "Pessoa está desnutrida");
        } else {
            if (imc < 20) {
                JOptionPane.showMessageDialog(null,
                        "Pessoa está abaixo do peso ideal");
            } else {
                if (imc >= 20 && imc <= 25) {
                    JOptionPane.showMessageDialog(null,
                            "Pessoa está no peso ideal");
                } else {
                    if (imc > 25 && imc <= 27) {
                        JOptionPane.showMessageDialog(null,
                                "Pessoa está acima do peso");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Pessoa está obesa");
                    }
                }
            }
        }
        }
    }