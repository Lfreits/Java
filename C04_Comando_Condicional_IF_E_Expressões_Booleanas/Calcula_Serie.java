package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

public class Calcula_Serie {
    public static void main(String[] args) {
        double serie = 0;
        for (int aux = 1; aux <= 6; aux++) {
            serie += (((aux - 1) * 2)+(aux*3))/((aux*6)+1.0);
        }
        System.out.println("Série = "+serie);
    }
}
