
public class Main {
  public static void main(String[] args) {
    int anoLancamento = 2021;
    boolean incuidoPlano = false; // true
    double notaFilme = 8.1;
    String tipoPlano = "normal"; // plus

    if (anoLancamento > 2020) {
      System.out.println("Lançamentos");
    } else {
      System.out.println("Filme Retro");
    }
    if (incuidoPlano || tipoPlano.equals("plus")) {
      System.out.println("Filme Liberado");
    } else {
      System.out.println("Assine o plano");
    }
  }
}
