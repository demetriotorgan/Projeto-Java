
//Leitura de Dados
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite seu filme favorito");
    String filme = leitura.nextLine();

    System.out.println("Digite o ano de lançamento");
    int anoDeLancamento = leitura.nextInt();

    System.out.println("Digite sua avaliação para o filme: ");
    double avaliacao = leitura.nextDouble();

    System.out.println(anoDeLancamento);
    System.out.println(filme);
    System.out.println(avaliacao);

    // Inserindo vários dados
    double media = 0;
    double nota = 0;
    for (int i = 0; i < 3; i++) {
      System.out.println("Diga sua avaliação para o filme: ");
      nota = leitura.nextDouble();
      media += nota;
    }
    System.out.println("A media de avaliação foi: " + media / 3);

    System.out.println("------Fazendo o loop com While------");
    double media2 = 0;
    double nota2 = 0;
    int totalNotas = 0;

    while (nota2 != -1) {
      System.out.println("Diga sua avaliação para o filme: ");
      nota2 = leitura.nextDouble();
      if (nota2 != -1) {
        media2 += nota2;
        totalNotas++;
      }
    }
    System.out.println("A nova nota foi: " + media2 / totalNotas);
  }
}