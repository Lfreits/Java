package C10_Listas_de_Dados_Vetores_Cia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vagas_do_predio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, placa, pesquisa;
        boolean pesquisaCerta = false;
        List <String> nomes = new ArrayList<>();
        List <String> placas = new ArrayList<>();
        for (int aux = 0; aux < 10; aux++){
            System.out.println("Informe o nome do dono da vaga: ");
            nome = teclado.nextLine();
            nomes.add(nome);
            System.out.println("Informe a placa do veículo: ");
            placa = teclado.nextLine();
            placas.add(placa);
        }
        System.out.println("Informe uma placa ou um nome para ser pesquisado na lista: ");
        pesquisa = teclado.nextLine();
        for (int aux = 0; aux < 10; aux++){
            if (pesquisa.equalsIgnoreCase(nomes.get(aux)) || pesquisa.equalsIgnoreCase(placas.get(aux))){
                System.out.println("A sua vaga é a número "+aux);
                pesquisaCerta = true;
            }
        }
        if (!pesquisaCerta){
            System.out.println("Você não possui uma vaga no edifício");
        }
        teclado.close();
    }
}
