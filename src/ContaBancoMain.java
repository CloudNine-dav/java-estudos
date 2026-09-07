public class  ContaBancoMain {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("dav");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("u caba la");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(600);
        p2.sacar(100);
        //p2.sacar(650);
        p2.fecharConta();
        p1.pagarMensal();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
