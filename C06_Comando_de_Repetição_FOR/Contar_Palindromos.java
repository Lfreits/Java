package C06_Comando_de_Repetição_FOR;

public class Contar_Palindromos {
    public static void main(String[] args) {
        double soma = 0, media;
        int cont = 0;
        for (int aux = 1000; aux <= 9999; aux++){
            if((aux % 10 == aux / 1000) && (aux / 100 % 10 == aux / 10 % 10)){
                soma += aux;
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("Média dos palíndromos: "+media);
    }
}
