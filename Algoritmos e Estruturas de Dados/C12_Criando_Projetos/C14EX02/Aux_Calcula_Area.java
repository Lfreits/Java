package C12_Criando_Projetos.C14EX02;
public class Aux_Calcula_Area {
    public static double AreaQuadrado(double lado){
        double area;
        area = Math.pow(lado,2);
        return area;
    }
    public static double AreaRetangulo(double lado1, double lado2){
        double area;
        area = lado1 * lado2;
        return area;
    }
    public static double AreaTrianguloRetangulo(double lado, double altura){
        double area;
        area = (lado * altura)/2.0;
        return area;
    }
    public static double AreaCirculo(double raio){
        double area;
        area = (Math.PI*Math.pow(raio,2));
        return area;
    }
}