package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//Faça um programa que execute as seguintes ações:
//Preencher duas listas dinâmicas de forma sincronizada, uma com CPFs e outra com endereços, de várias pessoas;
//Pedir um CPF qualquer;
//Pesquisar o CPF informado na lista de CPFs;
//Se achar, perguntar ao usuário se quer alterar o endereço ou excluir o CPF/endereço.
//Se ele responder que quer alterar, peça o novo endereço e atualize a lista de endereço.
//Se ele responder que quer excluir, exclua o CPF e o endereço das respectivas listas.
//Se não achar, informar que o CPF não foi encontrado e perguntar ao usuário se quer incluir o CPF com um novo endereço.
//Se ele responder que quer incluir, peça o novo endereço e o CPF e o endereço nas respectivas listas.
//Imprimir as duas listas de forma sincronizada (CPF – Endereço).
public class ExercicioCPF {
    public static void main(String[] args) {
        int cont = 0, pos = -1;
        double cpf, pesquisa;
        String endereco;
        char resposta;
        Scanner teclado = new Scanner(System.in);
        List<Double> CPF = new ArrayList<>();
        List<String> ENDERECO = new ArrayList<>();
        do {
            cont++;
            System.out.println("Informe o CPF da "+cont+"° pessoa: ");
            cpf = teclado.nextDouble();
            if (cpf == 0){
                break;
            }
            CPF.add(cpf);
            System.out.println("Informe o endereço da "+cont+"° pessoa: ");
            teclado.nextLine();
            endereco = teclado.nextLine();
            ENDERECO.add(endereco);
            System.out.println("Se já colocou todos os CPFs digite 0");
        } while (cpf != 0);
        System.out.println("Informe um CPF para ser pesquisado na lista: ");
        pesquisa = teclado.nextDouble();
        for (int aux = 0; aux < CPF.size(); aux++){
            if (CPF.get(aux) == pesquisa){
                pos = CPF.indexOf(pesquisa);
                System.out.println("CPF encontrado. Deseja alterar, excluir ou manter o CPF?(A/E/M)");
                resposta = teclado.next().charAt(0);
                if (resposta == 'A' || resposta == 'a'){
                    System.out.println("Informe o novo CPF: ");
                    cpf = teclado.nextDouble();
                    CPF.set(pos, cpf);
                    System.out.println("Informe o novo endereço: ");
                    endereco = teclado.nextLine();
                    ENDERECO.set(pos,endereco);
                    System.out.println("CPF adicionado com sucesso");
                }
                if (resposta == 'E' || resposta == 'e'){
                    CPF.remove(pos);
                    System.out.println("CPF e endereço removidos com sucesso");
                }
            }
        }
        if(pos == -1) {
            System.out.println("CPF não encontrado na lista. Deseja incluí-lo?(S/N)");
            resposta = teclado.next().charAt(0);
            if (resposta == 'S' || resposta == 's'){
                System.out.println("Informe o endereço para incluir junto ao CPF informado: ");
                endereco = teclado.nextLine();
                ENDERECO.add(endereco);
                CPF.add(pesquisa);
            }
        }
        System.out.println("\n Lista Final:");
        for (int aux = 0; aux < CPF.size(); aux++){
            System.out.println("CPF: "+CPF.get(aux)+" - Endereço: "+ENDERECO.get(aux));
        }
        teclado.close();
    }
}