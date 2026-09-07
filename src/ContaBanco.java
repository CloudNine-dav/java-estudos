public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("___________________________");
        System.out.println("conta" + this.getNumConta());
        System.out.println("tipo" + this.getTipo());
        System.out.println("dono" + this.getDono());
        System.out.println("saldo" + this.getSaldo());
        System.out.println("status" + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        //this.status = true;
        if (t.equals("CC")) {
            //this.saldo = 50;
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0 ) {
            System.out.println("a conta nao pode ser fechada com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("a conta nao pode ser fechada com débito");
        } else {
            this.setSaldo(0);
            System.out.println("conta fechada com sucesso");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(getSaldo() + v);
            System.out.println("deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("nao da pra depositar em uma conta fechada");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("saldo insuficiente na conta");
            }
        } else {
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;

    } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v );
            System.out.println("mensalidade paga por" + this.getDono());
        } else {
            System.out.println("impossivel pagar uma conta fechada");
        }

    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}