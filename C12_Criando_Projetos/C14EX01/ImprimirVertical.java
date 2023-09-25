package C12_Criando_Projetos.C14EX01;
public class ImprimirVertical {
    public static void ImprimirVertical(String frase) {
        String palavra[] = frase.split(" ");
        for (int aux = 0; aux < palavra.length; aux++){
            System.out.println(palavra);
        }
    }
}