package C10_Listas_de_Dados_Vetores_Cia;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Fazer_Lista_e_Pesquisar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        boolean achou = false;
        String nome, nomeTemp, raTemp, RA, pesquisa;
        List<String> nomes = new ArrayList<>();
        List<String> ra = new ArrayList<>();
        do {
            System.out.println("Informe o nome do "+(nomes.size()+1)+"° aluno: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                break;
            }
            nomes.add(nome);
            System.out.println("Informe a matrícula do(a) "+(nomes.get(nomes.size()-1)));
            RA = teclado.nextLine();
            ra.add(RA);
        } while (!nome.equalsIgnoreCase("FIM"));
        for (int aux = 0; aux < nomes.size()-1; aux++){
            for (int x = 0; x < nomes.size()-1; x++){
                if (nomes.get(x).compareToIgnoreCase(nomes.get(x+1)) > 0){
                    nomeTemp = nomes.get(x);
                    nomes.set(x, nomes.get(x+1));
                    nomes.set(x+1, nomeTemp);
                    raTemp = ra.get(x);
                    ra.set(x, ra.get(x+1));
                    ra.set(x+1, raTemp);
                }
            }
        }
        System.out.println("Informe o nome de um aluno para pesquisá-lo na lista: ");
        pesquisa = teclado.nextLine();
        for (int aux = 0; aux < nomes.size()-1; aux++){
            if (pesquisa.equalsIgnoreCase(nomes.get(aux))){
                System.out.println(pesquisa+", do RA "+ra.get(aux)+" foi encontrado(a) na posição "+(aux+1));
                achou = true;
            }
        }
        if (!achou){
            System.out.println("NOME NÃO ENCONTRADO");
        }
        teclado.close();
    }
}
