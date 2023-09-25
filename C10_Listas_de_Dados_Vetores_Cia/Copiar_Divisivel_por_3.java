package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Copiar_Divisivel_por_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        List <Integer> VET1 = new ArrayList<>();
        List <Integer> VET2 = new ArrayList<>();
        for (int aux = 0; aux < 10; aux++){
            System.out.println("Informe o "+(aux+1)+"° número da lista: ");
            numero = teclado.nextInt();
            VET1.add(numero);
            if (numero % 3 == 0){
                VET2.add(numero);
            }
        }
        for (int aux = 0; aux < VET2.size(); aux++){
            System.out.println(VET2.get(aux));

        }
        teclado.close();
    }
}
