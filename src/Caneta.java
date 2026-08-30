public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("modelo" + this.modelo);
        System.out.println("uma caneta" + this.cor);
        System.out.println("carga" + this.carga);
        System.out.println("esta tampada" + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("erro! esta tampada, nao posso rabiscar");
        } else {
            System.out.println("esta destampada, posso rabiscar");
        }
    }
    void tampar() {
        this.tampada = false;
    }
    void destampar() {
        this.tampada = true;
    }
}
