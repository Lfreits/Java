package C08_Comando_de_Repetição_DO_WHILE;

import java.util.Scanner;
public class Info_Funcionarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, mediaAlturaH, somaAlturaH = 0;
        int cont = 0, contM = 0, contH = 0, contMmagra = 0;
        char sexo;
        do {
            System.out.println("Informe a altura do funcionário: ");
            altura = teclado.nextDouble();
            if (altura == 0){
                break;
            }
            System.out.println("Informe o peso do funcionário: ");
            peso = teclado.nextDouble();
            System.out.println("Informe o sexo do funcionário: ");
            sexo = teclado.next().charAt(0);
            if (sexo == 'M' || sexo == 'm'){
                somaAlturaH +=altura;
                contH++;
            } else if (sexo == 'F' || sexo == 'f'){
                contM++;
                if (peso < 60){
                    contMmagra++;
                }
            }
            cont++;
        } while (altura != 0);
        mediaAlturaH = somaAlturaH/contH;
        teclado.close();
        System.out.println("Quantidade de pessoas pesquisadas: " + cont);
        System.out.println("Quantidade de mulheres: " + contM);
        System.out.println("Altura média dos homens: " + mediaAlturaH);
        System.out.println("Quantidade de mulheres com peso menor que 60: " + contMmagra);
    }
}
