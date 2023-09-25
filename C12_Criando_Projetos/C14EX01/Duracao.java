package C12_Criando_Projetos.C14EX01;
public class Duracao {
    public static String duracao(int horaFinal, int horaInicial, int minutoFinal, int minutoInicial) {
        int duracaoHora = (horaFinal-horaInicial);
        int duracaoMinuto = (minutoFinal-minutoInicial);
        if (duracaoHora <0) {
            duracaoHora = (duracaoHora+23);
        }
        if (duracaoMinuto<0) {
            duracaoMinuto = (duracaoMinuto+60);
            duracaoHora = (duracaoHora-1);
        }
        String duracaoTotal = duracaoHora+":"+duracaoMinuto;
        return duracaoTotal;
    }
}
