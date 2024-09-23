import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criação do scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Gera um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        int tentativa = 0;
        int chute;
        boolean acertou = false;

        // Loop até o jogador adivinhar o número
        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            chute = scanner.nextInt();
            tentativa++;

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativa + " tentativas.");
                acertou = true;
            } else if (chute > numeroAleatorio) {
                System.out.println("O número é menor! Tente novamente.");
            } else {
                System.out.println("O número é maior! Tente novamente.");
            }
        }

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}