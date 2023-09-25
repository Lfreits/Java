package C09_Comando_de_Repetição_WHILE;

import java.util.Scanner;
public class Resultados_X {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep, cont = 0, contImpar = 0;
        double resultado = 0, resultadoFinal = 0, media;
        System.out.println("Informe o valor de x final: ");
        rep = teclado.nextInt();
        while(cont <= rep){
            cont++;
            if (cont%2!=0){
                contImpar++;
                resultado = Math.pow(cont,2)+(((4*cont)-2)/5.0);
                System.out.println("Resultado quando x for "+cont+" = "+resultado);
                resultadoFinal += resultado;
            }
        }
        media = resultadoFinal/contImpar;
        System.out.println("Média dos resultados = "+media);
        teclado.close();
    }
}
