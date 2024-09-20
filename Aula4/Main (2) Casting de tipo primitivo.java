import java.util.Scanner;

//Comparando tipos primitivos que serao informados pelo usuario

public class Main {
  public static void main(String[] args) {
    // Exemplo de casting implícito (widening)
    int meuInt = 10;
    double meuDouble = meuInt;  // Conversão automática de int para double

    System.out.println("Valor original do int: " + meuInt);
    System.out.println("Valor após casting implícito para double: " + meuDouble);

    // Exemplo de casting explícito (narrowing)
    double outroDouble = 9.78;
    int outroInt = (int) outroDouble;  // Conversão manual de double para int (perde a parte decimal)

    System.out.println("Valor original do double: " + outroDouble);
    System.out.println("Valor após casting explícito para int: " + outroInt);
  }
}