package C09_Comando_de_Repetição_WHILE;

import java.util.Scanner;
public class Info_Multas {
    public static void main(String[] args) {
        Scanner arquivo = new Scanner(
                Info_Multas.class.getResourceAsStream("C11EX03.txt")
        );
        String placa;
        int dia, pontos, multa8quinzena = 0;
        double valor = 0, soma = 0;
        do {
            dia = arquivo.nextInt();
            if (dia == 99){
                break;
            }
            arquivo.nextLine();
            placa = arquivo.nextLine();
            pontos = arquivo.nextInt();
            System.out.println("Placa do carro que recebeu a multa: "+placa);
            if (pontos == 3){
                valor = 42;
            }
            if (pontos == 5){
                valor = 108;
            }
            if (pontos == 8){
                valor = 479;
            }
            if (dia < 15 && pontos == 8)
                multa8quinzena++;
            soma += valor;
            System.out.println("Multa recebida pela infração: "+valor);
        } while (dia != 99);
        System.out.println("Quantidade de multas de pontuação 8 da primeira quinzena do mês: "+multa8quinzena);
        System.out.println("Valor total arrecadado com as multas: "+soma);
        arquivo.close();
    }
}
