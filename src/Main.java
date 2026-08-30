import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("nota 1: ");
        double n1 = sc.nextDouble();

        System.out.println("nota 2: ");
        double n2 = sc.nextDouble();

        System.out.println("nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("\nAluno: " + nome);
        System.out.printf("Media: %2f%n", media);

        if (media >= 6.0) {
            System.out.println("aprovado! ");
        } else {
            System.out.println("reprovado! ");
        }
    }
}