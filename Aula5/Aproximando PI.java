
public class Main {
  public static void main(String[] args) {
        int numIteracoes = 1000000; // Defina o número de iterações (quanto maior, mais preciso)
            double pi = 0.0;

            // Série de Leibniz para aproximação de PI
            for (int i = 0; i < numIteracoes; i++) {
                // Alterna os sinais entre positivo e negativo
                if (i % 2 == 0) {
                    pi += 1.0 / (2 * i + 1);
                    System.out.println("Iteração " + i + ": " + pi);
                } else {
                    pi -= 1.0 / (2 * i + 1);
                    System.out.println("Iteração " + i + ": " + pi);
                }
            }

            pi *= 4; // Multiplica o resultado final por 4

            System.out.println("Aproximação de PI após " + numIteracoes + " iterações: " + pi);
        }
  }
