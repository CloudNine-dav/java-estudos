public class CanetaUml {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("modelo" + this.modelo);
        System.out.println("uma caneta" + this.cor);
        System.out.println("carga" + this.carga);
        System.out.println("esta tampada" + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("erro! esta tampada, nao posso rabiscar");
        } else {
            System.out.println("esta destampada, posso rabiscar");
        }
    }
    public void tampar() {
        this.tampada = false;
    }
    public void destampar() {
        this.tampada = true;
    }
}
