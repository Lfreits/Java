package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Series {
    public static void main(String[] args) {
        double serieA = 0, serieB = 0, serieC = 0, serieD = 0, serieE = 0, serieF = 0;
        int rep;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de termos das séries: ");
        rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++){
            serieA += (aux)/(Math.sqrt(aux*2));
            serieB += (aux*2)/(aux*3.0);
            serieC += ((aux*2)-1)/(aux*2.0);
            serieD += (aux + (aux-1.0))/(aux*aux);
            serieE += (aux)/(3*(aux*2.0));
            serieF += (aux*aux)/(Math.pow((aux*2),2));
        }
        serieB = 1 + Math.sqrt(serieB);
        serieC = (1.0/3)*Math.pow(serieC,2);
        teclado.close();
        System.out.println("Série A = "+serieA);
        System.out.println("Série B = "+serieB);
        System.out.println("Série C = "+serieC);
        System.out.println("Série D = "+serieD);
        System.out.println("Série E = "+serieE);
        System.out.println("Série F = "+serieF);
    }
}
