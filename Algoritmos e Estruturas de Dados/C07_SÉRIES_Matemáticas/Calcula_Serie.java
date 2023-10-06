package C07_SÉRIES_Matemáticas;

public class Calcula_Serie {
    public static void main(String[] args) {
        double serieB = 0;
        for (int aux = 1; aux <= 37; aux++){
            serieB += ((38.0-aux)*(39.0-aux))/aux;
        }
        System.out.println(serieB);
    }
}
