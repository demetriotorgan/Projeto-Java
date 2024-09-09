import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicitando o primeiro número inteiro
    System.out.print("Digite o primeiro número inteiro: ");
    int numero1 = scanner.nextInt();

    // Solicitando o segundo número inteiro
    System.out.print("Digite o segundo número inteiro: ");
    int numero2 = scanner.nextInt();

    // Somando os dois números inteiros
    int soma = numero1 + numero2;

    // Exibindo o resultado
    System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);

    // Fechando o scanner
    scanner.close();
    
  }  
}