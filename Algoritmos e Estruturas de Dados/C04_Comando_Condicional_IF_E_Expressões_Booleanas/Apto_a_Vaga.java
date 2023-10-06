package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;

public class Apto_a_Vaga {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char resposta;
        boolean p1 = false, p2 = false, p3 = false, p4 = false, p5 = false, p6 = false, p7 = false, p8 = false, p9 = false;
        System.out.println("Responda com V ou F");
        System.out.println("Você tem curso técnico de programação?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p1 = true;
        }
        System.out.println("Você tem curso superior de programação?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p2 = true;
        }
        System.out.println("Você tem menos de 3 anos de experiência em programação?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p3 = true;
        }
        System.out.println("Você se considera uma pessoa criativa?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p4 = true;
        }
        System.out.println("Você prefere liderar a ser liderado?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p5 = true;
        }
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p6 = true;
        }
        System.out.println("Você é autodidata (aprende sozinho?)");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p7 = true;
        }
        System.out.println("Você aceitaria uma remuneração inicial de R$ 1500?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p8 = true;
        }
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
        resposta = teclado.next().charAt(0);
        if (resposta == 'V' || resposta == 'v') {
            p9 = true;
        }
        if (p1 == true && p3 == true || p2 == true && p4 == true && p5 == true || p8 == false && p6 == false && p7 == true && p9 == false) {
            System.out.println("Pessoa está apta a trabalhar na empresa");
        } else {
            System.out.println("Pessoa não está apta a trabalhar na empresa");
        }
        teclado.close();
    }
}