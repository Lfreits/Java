package EX01;

public class Conta {
    public int agencia;
    public int numConta;
    public String cliente;
    public float saldo;
    static int totalContas = 0;

    public Conta() {
        this.agencia = 0;
        this.numConta = 0;
        this.cliente = "";
        this.saldo = 0;
    }

    public Conta(int agencia, int numConta, String cliente, float saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    float getSaldo() {
        return saldo;
    }

    boolean sacar(float valor) {
        if (valor > saldo) return false;
        saldo = saldo - valor;
        return true;
    }

    void depositar(float valor) {
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        String msg = "Agencia: "+agencia+" - Conta: "+numConta+"\nNome: "+cliente+"\nSaldo: R$ " + String.format("%.2f", saldo) + "\n";
        return msg;
    }
}