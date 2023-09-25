package C10_Listas_de_Dados_Vetores_Cia;

import java.util.Scanner;
public class Imprimir_Frase_Vertical {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Informe uma frase para ser impressa na forma vertical: ");
        frase = teclado.nextLine();
        String[] palavra = frase.split(" ");
        for (int aux = 0; aux < palavra.length; aux++){
            System.out.println(palavra[aux]);
        }
        teclado.close();
    }
}