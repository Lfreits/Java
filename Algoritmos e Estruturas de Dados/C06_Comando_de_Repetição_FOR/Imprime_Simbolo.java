package C06_Comando_de_Repetição_FOR;

public class Imprime_Simbolo {
    public static void main(String[] args) {
        for (int aux = 1; aux <= 10; aux++) {
            for (int aux1 = 1; aux1 <= 10; aux1++) {
                for (int aux2 = 1; aux2 <= aux1; aux2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int aux3 = 1; aux3 <= 10; aux3++) {
                for (int aux4 = 10; aux4 >= aux3; aux4--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
