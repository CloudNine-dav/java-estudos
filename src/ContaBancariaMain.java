public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "cloudnine";
        conta.numeroConta = 1;
        conta.depositar(1000);
        conta.verSaldo();
        conta.sacar(500);
        conta.verSaldo();
        conta.sacar(4000);
    }

}
