package C11_Modularização_Classes_Métodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calcula_Varios_IR_com_Funcao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <String> Listnome = new ArrayList<>();
        List <Double> ListIR = new ArrayList<>();
        String nome, TempNome;
        double TempIR;
        double salario;
        int dependentes;
        int cont = 0;
        do {
            cont++;
            System.out.println("Informe o nome do "+cont+"° funcionário: ");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                break;
            }
            Listnome.add(nome);
            System.out.println("Informe o salário do(a) "+nome+":");
            salario = teclado.nextDouble();
            System.out.println("Informe o número de dependentes do(a) "+nome+":");
            dependentes = teclado.nextInt();
            ListIR.add(Calcula_IR_com_Funcao.ir(salario,dependentes));
            teclado.nextLine();
        } while (!nome.equalsIgnoreCase("FIM"));
        for (int aux = 0; aux < Listnome.size()-1; aux++){
            for (int x = 0; x < Listnome.size()-1; x++){
                TempIR = ListIR.get(aux);
                ListIR.set(aux,ListIR.get(aux+1));
                ListIR.set(aux+1,TempIR);
                TempNome = Listnome.get(aux);
                Listnome.set(aux, Listnome.get(aux+1));
                Listnome.set(aux+1, TempNome);
            }
        }
        for (int aux = 0; aux < Listnome.size(); aux++){
            System.out.println("Imposto de renda do(a) "+Listnome.get(aux)+" = "+ListIR.get(aux));
        }
        teclado.close();
    }
}
