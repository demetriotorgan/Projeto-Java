//Definir a classe Pessoa
public class Pessoa {
  // Atributos da classe
  private String nome;
  private int idade;

  // Constuctor para inicializar a classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // metodos da classe
  public String exibirInfo() {
    return "Nome: " + nome + ", Idade: " + idade;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}