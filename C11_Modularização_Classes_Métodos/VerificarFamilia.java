package C11_Modularização_Classes_Métodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificarFamilia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String familia, nomes;
        List <String> ListNomesFamilia = new ArrayList<>();
        System.out.println("Informe o nome da família: ");
        familia = teclado.nextLine();
        for (int aux = 0; aux < 100; aux++) {
            System.out.println("Informe o "+(aux+1)+"° nome: ");
            nomes = teclado.nextLine();
            if (nomes.toUpperCase().endsWith(familia.toUpperCase())){
                System.out.println("Nome pertece à família");
                ListNomesFamilia.add(nomes);
            }
        }
        System.out.println("\nNomes que podem pertencer à família: ");
        for (int aux = 0; aux < ListNomesFamilia.size(); aux++){
            System.out.println(ListNomesFamilia.get(aux));
        }
        System.out.println("Total: "+ListNomesFamilia.size());
        teclado.close();
    }
}
