package controle;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligar;
    private boolean tocando;
    private boolean mudo;

    public ControleRemoto() {
        this.volume = 50;
        this.ligar = false;
        this.tocando = false;
        this.mudo = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigando() {
        return ligar;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public void setLigado(boolean l) {
        this.ligar = l;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.ligar = true;
    }

    @Override
    public void desligar() {
        this.ligar = false;
    }

    @Override
    public void abrirMenu() {
        this.ligar = true;
        System.out.println("esta ligado " + this.getLigando());
        System.out.println("esta tocando " + this.getTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("||");
        }
    }

    @Override
    public void fecharMenu() {
        this.ligar = false;
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.volume < 100) this.volume += 5;
    }

    @Override
    public void menosVolume() {
        if(this.volume > 0) this.volume -= 5;
    }

    @Override
    public void ligarMudo() {
        this.mudo = true;
    }


    @Override
    public void desligarMudo() {
        this.mudo = false;
    }

    @Override
    public void play() {
        this.tocando = true;
    }

    @Override
    public void pause() {
        this.tocando = false;
    }

}
