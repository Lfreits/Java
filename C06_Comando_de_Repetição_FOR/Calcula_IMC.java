package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Calcula_IMC {
    public static void main(String[] args) {
        double altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        for (int aux = 60; aux <= 100; aux++){
            imc = (aux/(Math.pow(altura,2)));
            if (imc < 20){
                System.out.println("Se a pessoa estiver com "+aux+" quilos, o IMC dela é "+imc+", ou seja, ela está abaixo do peso");
            } else if (imc <= 25) {
                System.out.println("Se a pessoa estiver com "+aux+" quilos, o IMC dela é "+imc+", ou seja, ela está no peso ideal");
            } else {
                System.out.println("Se a pessoa estiver com "+aux+" quilos, o IMC dela é "+imc+", ou seja, ela está acima do peso");
            }
        }
        teclado.close();
    }
}
