package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Area_Setor_Circular {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo, raio, S;
        System.out.println("Informe o valor do ângulo: ");
        angulo = teclado.nextDouble();
        do {
            System.out.println("Informe o valor do raio: ");
            raio = teclado.nextDouble();
            if (raio == -1){
                break;
            }
            S = (angulo*Math.PI*Math.pow(raio,2))/360;
            System.out.println("S = "+S);
        } while (raio != -1);
        teclado.close();
    }
}
