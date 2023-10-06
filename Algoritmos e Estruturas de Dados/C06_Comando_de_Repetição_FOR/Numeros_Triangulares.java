package C06_Comando_de_Repetição_FOR;

public class Numeros_Triangulares {
    public static void main(String[] args) {
        int soma = 0, media, cont = 0;
        System.out.print("Números triangulares = ");
        for (int aux1 = 1,aux2 = 2,aux3 = 3, numero = 0; numero <= 1000; aux1++,aux2++,aux3++){
            numero = aux1*aux2*aux3;
            if (numero > 1000){
                break;
            }
            soma += numero;
            cont++;
            System.out.print(numero+", ");
        }
        media = soma/cont;
        System.out.print("\nMédia = "+media);
    }
}
