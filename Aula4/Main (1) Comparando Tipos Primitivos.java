import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite algo: ");
    String entrada = scanner.nextLine();

    // Tenta converter a entrada para um inteiro
    try {
        int numero = Integer.parseInt(entrada);
        System.out.println("Você digitou um número inteiro: " + numero);
    } catch (NumberFormatException e) {
        System.out.println("Você digitou uma string: " + entrada);
    }

    scanner.close();
  }
}