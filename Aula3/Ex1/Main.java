
public class Main {
  public static void main(String[] args) {

    // Instanciando o objeto Pessoa
    Pessoa pessoa1 = new Pessoa("Miguel", 17);
    Pessoa pessoa2 = new Pessoa("Sofia", 17);
    Pessoa pessoa3 = new Pessoa("Tauã", 18);

    System.out.println(pessoa3.exibirInfo());
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getIdade());
  }
}