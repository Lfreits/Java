package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.Arrays;
public class Meses_em_Alfabetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = new String[12];
        for (int aux = 0; aux < meses.length; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° mês do ano: ");
            meses[aux] = teclado.nextLine();
        }
        Arrays.sort(meses);
        for (int aux = 0; aux < meses.length; aux++){
            System.out.println(meses[aux]);
        }
        teclado.close();
    }
}
