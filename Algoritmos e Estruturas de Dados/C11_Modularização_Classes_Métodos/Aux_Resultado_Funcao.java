package C11_Modularização_Classes_Métodos;

public class Aux_Resultado_Funcao {
    public static double fx(double numero){
        double resultado;
        if (numero < 4){
            resultado = ((5*numero)+3)/Math.sqrt(16-Math.pow(numero , 2));
        } else if (numero == 4) {
            resultado = 0;
        } else {
            resultado = ((5*numero)+3)/Math.sqrt(Math.pow(numero , 2)-16);
        }
        return resultado;
    }
}
