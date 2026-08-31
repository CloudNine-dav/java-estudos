public class Carro {
        String modelo = "porshe gt3";
        String cor = "laranja";
        int vel = 315;
        boolean ligado;

        void ligar() {
            ligado = true;
            System.out.println("carro logado!");
        }

        void desligar() {
            ligado = false;
            System.out.println("carro desligado!");
        }

        void acelerar() {
            if (ligado) {
                vel += 10;
                System.out.println("velocidade" + vel);
            } else {
                System.out.println("ligue o carro para partir");
            }
        }
}
