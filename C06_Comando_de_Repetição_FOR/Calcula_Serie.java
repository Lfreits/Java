package C06_Comando_de_Repetição_FOR;

public class Calcula_Serie {
    public static void main(String[] args) {
        int soma = 0;
        double numero;
        for (int aux = 1; aux <= 100; aux++){
            numero = Math.pow(aux,2);
            soma += numero;
            System.out.println(numero);
        }
        System.out.println("Soma dos 100 primeiros termos: "+soma);
    }
}
