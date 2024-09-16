public class Filme {
  private String titulo;
  private int anoLancamento;
  private int duracao;

  public Filme(String titulo, int anoLancamento, int duracao) {
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public int getDuracao() {
    return duracao;
  }

  // @Override
  public String exibirInfo() {
    return "Titulo: " + titulo + ", Ano de Lançamento: " + anoLancamento + ", Duração: " + duracao;
  }
}
