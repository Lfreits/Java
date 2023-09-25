package C07_SÉRIES_Matemáticas;

public class Calcula_Serie_8 {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 20; aux++){
            serie += (((aux*2)+1)*(Math.sqrt((aux*4)+1)))/Math.pow(5,aux);
        }
        serie = Math.pow(serie,2);
        System.out.println("Série = "+serie);
    }
}
