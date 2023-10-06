package C12_Criando_Projetos.C14EX01;
public class ConverterCelsius {
    public static String ConverterCelsius(double celsius) {
        double kelvin, fahrenheit;
        kelvin = (celsius+273.0);
        fahrenheit = (((celsius*9)+160)/5);
        String resultado = "Temperatura em Kelvin = "+kelvin+" e em Fahrenheit = "+fahrenheit;
        return resultado;

    }
}
