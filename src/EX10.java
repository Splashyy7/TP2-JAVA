import java.util.Random;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            }
        }

        System.out.println("Parabéns! Você acertou o número secreto.");

        scanner.close();
    }
}