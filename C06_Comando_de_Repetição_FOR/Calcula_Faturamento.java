package C06_Comando_de_Repetição_FOR;

import java.util.Scanner;
public class Calcula_Faturamento {
    public static void main(String[] args) {
        double faturamento;
        int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0, codigo;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 1000; aux++){
            System.out.println("Informe o código do produto comprado: ");
            codigo = teclado.nextInt();
            if (codigo == 1){
                qtd1++;
            }
            if (codigo == 2){
                qtd2++;
            }
            if (codigo == 3){
                qtd3++;
            }
            if (codigo == 4){
                qtd4++;
            }
            if (codigo == 5){
                qtd5++;
            }
        }
        faturamento = ((qtd1*1565.0)+(qtd2*1890.0)+(qtd3*2150.0)+(qtd4*2963.0)+(qtd5*3750.0));
        System.out.printf("Faturamento total: %.2f"+faturamento);
        teclado.close();
    }
}
