package C06_Comando_de_Repetição_FOR;

public class Imprime_Simbolo_2 {
    public static void main(String[] args) {
        for (int aux4 = 1; aux4 <= 10; aux4++) {
            for (int aux = 1; aux <= 10; aux++) {
                for (int aux1 = 1; aux1 <= aux; aux1++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int aux3 = 1; aux3 <= 10; aux3++) {
                for (int aux2 = 10; aux2 >= aux3; aux2--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
