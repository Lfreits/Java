package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Inverter_Meses_do_Ano {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        String[] vet = new String[12];
        for (int aux = 0; aux < vet.length; aux++){
            System.out.println("Informe o nome do "+(aux+1)+"° mês do ano");
            vet[aux] = teclado.nextLine();
        }
        for (int aux = vet.length; aux > 0; aux--){
            System.out.println(vet[aux-1]);
        }
        teclado.close();
    }
}
