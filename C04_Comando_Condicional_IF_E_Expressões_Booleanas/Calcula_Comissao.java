package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Calcula_Comissao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fixo, vendas, total;
        System.out.println("Informe o valor total das vendas do funcionário:");
        vendas = teclado.nextDouble();
        fixo = 240.0;
        if (vendas <= 1000) {
            total = fixo;
        } else {
                if (vendas > 1000 && vendas <= 10000) {
                    total = (fixo + (vendas * 0.1));
                } else {
                        total = (fixo+1000.0);
                    }
                }
        System.out.println("Salário = "+total);
        teclado.close();
            }
        }
