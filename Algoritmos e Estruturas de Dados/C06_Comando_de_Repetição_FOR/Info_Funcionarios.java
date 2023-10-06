package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Info_Funcionarios {
    public static void main(String[] args) {
        String nome, cargo, nomeMaior = null, cargoMaior = null;
        double salario, soma = 0, media, salarioMaior = 0;
        int idade, qtd18 = 0;
        Scanner arquivo = new Scanner(
                Info_Funcionarios.class.getResourceAsStream("c08ex15.txt"));
        for (int aux = 1; aux <= 7; aux++) {
            nome = arquivo.nextLine();
            cargo = arquivo.nextLine();
            salario = arquivo.nextDouble();
            idade = arquivo.nextInt();
            arquivo.nextLine();
            if (salario > 10000 && idade > 50){
                System.out.println(nome+" é um sênior");
            } else {
                System.out.println(nome+" não é sênior");
            }
            if (idade <= 18){
                soma += salario;
                qtd18++;
            }
            if (aux == 1 || salarioMaior < salario){
                salarioMaior = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }
        media = soma/qtd18;
        System.out.println("Letra B) "+media);
        System.out.println("Letra C) Nome: "+nomeMaior+" - Cargo: "+cargoMaior);
    }
}
