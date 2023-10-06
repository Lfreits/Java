package C12_Criando_Projetos.C14EX02;

import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        double area;
        System.out.println("Informe o código da figura geométrica" +
                "\n1 -> Quadrado" +
                "\n2 -> Retangulo" +
                "\n3 -> Triângulo Retângulo" +
                "\n4 -> Círculo" +
                "\n>>>");
        opcao = teclado.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Informe o lado do quadrado: ");
                double lado = teclado.nextDouble();
                area = Aux_Calcula_Area.AreaQuadrado(lado);
                System.out.println("Área do quadrado = "+area);
                break;
            case 2:
                System.out.println("Informe o lado maior do retângulo: ");
                double lado1 = teclado.nextDouble();
                System.out.println("Informe o lado menor do retângulo: ");
                double lado2 = teclado.nextDouble();
                area = Aux_Calcula_Area.AreaRetangulo(lado1,lado2);
                System.out.println("Área do retângulo = "+area);
                break;
            case 3:
                System.out.println("Informe o lado do triângulo:");
                lado = teclado.nextDouble();
                System.out.println("Informe a altura do triângulo: ");
                double altura = teclado.nextDouble();
                area = Aux_Calcula_Area.AreaTrianguloRetangulo(lado,altura);
                System.out.println("Área do Triângulo Retângulo = "+area);
                break;
            case 4:
                System.out.println("Informe o raio do círculo: ");
                double raio = teclado.nextDouble();
                area = Aux_Calcula_Area.AreaCirculo(raio);
                System.out.println("Área do círculo = "+area);
                break;
            default: System.out.println("Número inválido");
        }
        teclado.close();
    }
}