package C07_SÉRIES_Matemáticas;

public class Calcula_Serie_2 {
    public static void main(String[] args) {
        double serieD = 0;
        for (int aux = 1; aux <= 100; aux++){
         serieD += aux/((aux*aux)+(aux-1.0));
        }
        System.out.println("SerieD = "+serieD);
    }
}
