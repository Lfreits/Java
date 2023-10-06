package C06_Comando_de_Repetição_FOR;

public class Calcula_Serie_3 {
    public static void main(String[] args) {
        String texto = "*";
        double serie = 1;
        for (int aux1 = 1; aux1 <= 10; aux1++) {
            for (int aux2 = 1; aux2 <= 8; aux2++) {
                System.out.println(texto.repeat((int) serie));
                serie = serie * 2;
            }
            serie /= 2;
            for (int aux2 = 7; aux2 >= 1; aux2--) {
                serie /= 2;
                System.out.println(texto.repeat((int) serie));
            }
        }

    }
}