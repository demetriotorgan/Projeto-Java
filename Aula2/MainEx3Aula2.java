import java.util.Scanner;

// Definindo a classe Pessoa
class Pessoa {
    // Atributos da classe
    String nome;
    int idade;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Demetrio", 37);
        // Chamando o método para exibir as informações
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}