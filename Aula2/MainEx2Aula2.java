import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicitando o tamanho do array
    System.out.print("Quantos números você deseja inserir? ");
    int tamanho = scanner.nextInt();

    // Criando um array para armazenar os números
    int[] numeros = new int[tamanho];

    // Lendo os números inseridos pelo usuário
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    // Ordenando o array em ordem crescente
    Arrays.sort(numeros);

    // Exibindo os números ordenados
    System.out.println("Os números em ordem crescente são:");
    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }

    // Fechando o scanner
    scanner.close();
  }
}