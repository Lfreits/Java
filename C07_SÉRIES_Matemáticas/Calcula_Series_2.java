package C07_SÉRIES_Matemáticas;

import java.util.Scanner;
public class Calcula_Series_2 {
    public static void main(String[] args) {
        int rep;
        double serieA = 0, serieB = 0, serieC = 0, serieD = 0, serieE = 0, serieF = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de termos das séries: ");
        rep = teclado.nextInt();
        for (int aux = 0; aux <= rep-1; aux++){
            serieA += ((aux+1)+((aux*7)+1))/Math.pow(4,aux);
            serieD += (Math.pow(aux,3))/(Math.pow(10,aux-1));
        }
        for (int aux = 1; aux <= rep; aux++){
            serieB += ((aux*3.0)-2)/(Math.sqrt((aux*3)+4));
            serieC += (((aux*2)+1)*(Math.sqrt((4*aux)+1)))/(Math.pow(5,aux));
            serieE += (Math.pow(aux,2)*Math.sqrt((aux*2)+3))/Math.pow((aux+1),aux);
            serieF += (((aux*2)-1)*(Math.pow(2,aux+1)))/(Math.pow((5*aux)-3,2));
        }
        serieA = Math.cbrt(serieA);
        serieB *= (5/3.0);
        serieC = Math.pow(serieC,2);
        serieE *= (2/3.0);
        serieF = 5*Math.sqrt(serieF);
        teclado.close();
        System.out.println("Série A = "+serieA);
        System.out.println("Série B = "+serieB);
        System.out.println("Série C = "+serieC);
        System.out.println("Série D = "+serieD);
        System.out.println("Série E = "+serieE);
        System.out.println("Série F = "+serieF);
    }
}
