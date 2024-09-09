import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicitando o nome do usuário
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    // Solicitando a idade do usuário
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    // Exibindo uma mensagem personalizada
    System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

    // Fechando o scanner
    scanner.close();
  }
}