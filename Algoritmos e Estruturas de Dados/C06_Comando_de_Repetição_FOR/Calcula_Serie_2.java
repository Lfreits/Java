package C06_Comando_de_Repetição_FOR;

public class Calcula_Serie_2 {
    public static void main(String[] args) {
        double serie, soma = 0;
        for (int aux = 1; aux <= 99; aux++) {
            if (aux % 2 != 0) {
                soma += (Math.pow(2, aux));
            }
        }
        serie = soma/3;
        System.out.println("Valor da série: "+serie);
    }
}
