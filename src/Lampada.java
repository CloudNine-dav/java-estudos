public class Lampada {
    String cor = "amarelo";
    int potencia = 99;
    boolean acender;

        void acender() {
        acender = true;
        System.out.println("luz acesa");
    }

        void apagar() {
        acender = false;
        System.out.println("apagou a luz!");
    }

         void status() {
            if (acender) {
                System.out.println("luz acesa!" + acender);
            } else {
                System.out.println("a luz esta apagada!" + acender);
            }
    }

}
