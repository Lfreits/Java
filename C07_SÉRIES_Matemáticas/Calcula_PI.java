package C07_SÉRIES_Matemáticas;

public class Calcula_PI {
    public static void main(String[] args) {
        double pi = 0;
        int cont = 0;
        for (int aux = 1; aux <= 10000; aux+=2){
            if (cont % 2 == 0){
                pi+=1.0/aux;
            } else {
                pi-=1.0/aux;
            }
            cont++;
        }
        pi *= 4;
        System.out.println("Valor de PI = "+pi);
    }
}
