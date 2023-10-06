package C07_SÉRIES_Matemáticas;

public class Calcula_Serie_7 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 6; aux++){
            serie += (((aux-1)*2)+(aux*3))/((aux*6)+1.0);
        }
        System.out.println("Série = "+serie);
    }
}
