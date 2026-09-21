public class LutadorMain {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("dav", "brasil", 17, 1.70, 53.0, 1, 5, 4);
        Lutador l2 = new Lutador("leo", "korea", 16, 1.72, 120.0, 10, 1, 7);
        Lutador l3 = new Lutador("gabi", "brasil", 19, 1.68, 70.3, 1, 1, 4);

        l1.apresentar();
        l1.ganharLuta();
        l1.status();

        l2.apresentar();
        l2.ganharLuta();
        l2.status();

        l3.apresentar();
        l3.ganharLuta();
        l3.status();
    }
}
