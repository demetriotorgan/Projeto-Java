import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Exercicio 1
    // Solicitando o primeiro numero
    // System.out.println("Digite um numero: ");
    // double numero = scanner.nextDouble();
    // if (numero >= 0) {
    // System.out.println("O número é positivo");
    // } else {
    // System.out.println("O número é negativo ");
    // }
    // scanner.close();

    // Exercicio 2
    // Solicitando o primeiro numero
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scanner.nextInt();

    System.out.println("Digite o segundo numero: ");
    int numero2 = scanner.nextInt();

    // Comprando os dois numeros
    if (numero1 == numero2) {
      System.out.println("Os numeros são iguais");
    } else if (numero1 > numero2) {
      System.out.println("O numero 1 é maior que o numero 2");
    } else {
      System.out.println("O numero 2 é maior que o numero 1");
    }
    scanner.close();
  }
}