public class LampadaMain {
    public static void main(String[] args) {
        Lampada lP = new Lampada();
        lP.cor = "amarelo";
        lP.potencia = 99;
        lP.acender();
        lP.status();
        lP.apagar();
        lP.status();
    }
}
