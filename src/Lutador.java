public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("nome do lutador: " + this.getNome());
        System.out.println("nacionalidade: " + this.getNacionalidade());
        System.out.println("idade: " + this.getIdade());
        System.out.println("altura: " + this.getAltura());
        System.out.println("peso: " + this.getPeso());
        System.out.println("categoria: " + this.getCategoria());
        System.out.println("vitorias: " + this.getVitorias());
        System.out.println("derrotas: " + this.getDerrotas());
        System.out.println("empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println(this.getNome() + " é de categoria:" + this.getCategoria());
        System.out.println("ganhou: " + this.getVitorias() + "vezes em sua carreira! ");
        System.out.println("perdeu: " + this.getDerrotas() + "vezes em sua carreira! ");
        System.out.println("empatou: " + this.getEmpates() + "vezes em sua carreira! ");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        System.out.println("vc ganhou uma luta! ");
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
        System.out.println("vc perdeu uma partida!");

    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
        System.out.println("vc empatou a partida. foi quase!");
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.0) {
            this.categoria = "invalido!";
        } else if (this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 80) {
            this.categoria = "medio";
        } else if (this.peso <= 120) {
            this.categoria = "pesado";
        } else {
            this.categoria = "invalido!";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
