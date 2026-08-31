public class ContaBancaria {
    public String titular;
    private double saldo = 3000;
    protected int numeroConta;

    public void sacar(double valor) {
       if (valor > saldo) {
           System.out.println("saldo insuficiente! ");
       } else {
           saldo -= valor;
           System.out.println("voce sacou! ");
       }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("deposito realizado! ");
    }
    public void verSaldo() {
        System.out.println("seu saldo é " + saldo);
    }
}
