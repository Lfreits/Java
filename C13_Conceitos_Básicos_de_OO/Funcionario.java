package C13_Conceitos_Básicos_de_OO;

public class Funcionario {
    private String nome, empresa, cargo;
    private double salario;
    private int idade;
    public Funcionario(String nome, String cargo, String empresa, double salario, int idade){
        this.nome = nome;
        this.empresa = empresa;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
    }

    public void ImprimeFuncionario(){
        System.out.println("Nome do funcionário: "+this.nome);
        System.out.println("Empresa do "+this.nome+": "+this.empresa);
        System.out.println("Cargo do "+this.nome+": "+this.cargo);
        System.out.println("Salário do "+this.nome+": "+this.salario);
        System.out.println("Idade do "+this.nome+": "+this.idade);
    }

    public double CalculaINSS1Aliquota(){
        double INSS = (salario * 0.08);
        return INSS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
