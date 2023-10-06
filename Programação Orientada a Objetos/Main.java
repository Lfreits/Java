package EX01;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.agencia = 10;
        c1.numConta = 1010;
        c1.cliente = "Pedro Paulo";
        c1.saldo = 1000;

        Conta c2 = new Conta(10,2020, "Claudia Santos Silva", 2000);


        System.out.println(c1);
        System.out.println(c2);


    }
}
