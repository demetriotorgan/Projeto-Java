import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Exibe o menu de opções
    System.out.println("Escolha uma opção:");
    System.out.println("1. Calcular área do quadrado");
    System.out.println("2. Calcular área do círculo");
    System.out.print("Digite sua escolha: ");
    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:
        // Calcular a área do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado é: %.2f%n", areaQuadrado);
        break;

      case 2:
        // Calcular a área do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * raio * raio;
        System.out.printf("A área do círculo é: %.2f%n", areaCirculo);
        break;

      default:
        // Opção inválida
        System.out.println("Opção inválida! Tente novamente.");
        break;
    }

    scanner.close();
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}