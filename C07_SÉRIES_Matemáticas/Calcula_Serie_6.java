package C07_SÉRIES_Matemáticas;

public class Calcula_Serie_6 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 20; aux++){
            serie += aux/Math.sqrt(2*aux);
        }
        serie += 10;
        System.out.println("Série = "+serie);
    }
}
