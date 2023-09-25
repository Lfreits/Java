package C06_Comando_de_Repetição_FOR;

public class Calcula_Fx {
    public static void main(String[] args) {
        int x;
        double fx;
        for (int aux = 3; aux <= 12; aux++){
            x = aux;
            fx = Math.sqrt(Math.pow(x,2)-3);
            System.out.println("X = "+x+" F(x) = "+fx);
        }
    }
}
