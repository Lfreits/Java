package C13_Conceitos_Básicos_de_OO;

public class Motoboy extends Funcionario{
    private String placaMoto;
    private int qtdEntregas;

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    public int getQtdEntregas() {
        return qtdEntregas;
    }

    public void setQtdEntregas(int qtdEntregas) {
        this.qtdEntregas = qtdEntregas;
    }

    public Motoboy(String nome, String cargo, String empresa, double salario, int idade, int qtdEntregas, String placaMoto) {
        super(nome, cargo, empresa, salario, idade);
        this.placaMoto = placaMoto;
        this.qtdEntregas = qtdEntregas;
    }
    public double CustoPorEntrega(){
        double custoPorEntrega;
        custoPorEntrega = getSalario()/getQtdEntregas();
        return custoPorEntrega;
    }

    public void ImprimeMotoboy(){
        super.ImprimeFuncionario();
        System.out.println("Placa da moto: "+this.placaMoto);
        System.out.println("Quantidade de entregas: "+this.qtdEntregas);
    }
}
