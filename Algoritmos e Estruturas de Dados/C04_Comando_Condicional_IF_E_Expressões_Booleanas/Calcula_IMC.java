package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Calcula_IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double peso, altura, imc;
        System.out.println("Informe a altura da pessoa em metros:");
        altura = teclado.nextDouble();
        System.out.println("Informe o peso da pessoa em kg:");
        peso = teclado.nextDouble();
        imc = (peso/Math.pow(altura,2));
        if (imc < 18) {
            System.out.println("Pessoa está desnutrida");
        } else {
            if (imc < 20) {
                System.out.println("Pessoa está abaixo do peso");
            } else {
                if (imc >= 20 && imc <= 25) {
                    System.out.println("Pessoa está no peso ideal");
                } else {
                    if (imc > 25 && imc <= 27) {
                        System.out.println("Pessoa está acima do peso");
                    } else {
                        System.out.println("Pessoa está obesa");
                    }
                }
            }
        }
        teclado.close();
        }
    }