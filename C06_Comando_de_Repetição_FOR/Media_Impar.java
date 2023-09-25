package C06_Comando_de_Repetição_FOR;

public class Media_Impar {
    public static void main(String[] args) {
        int contImpar = 0, soma = 0, media;
        for (int aux = 1000; aux <= 2000; aux++){
            if (aux % 2 != 0){
                contImpar++;
                soma += aux;
            }
        }
        media = soma/contImpar;
        System.out.println("Média dos números ímpares: "+media);
    }
}
