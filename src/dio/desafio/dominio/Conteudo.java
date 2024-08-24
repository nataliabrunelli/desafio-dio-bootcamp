package dio.desafio.dominio;

public abstract class Conteudo {

  // Atributos
  protected static final double XP_PADRAO = 10d;
  private String titulo;
  private String descricao;

  // Getters e Setters
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  // Método para as filhas implementarem
  protected abstract double calcularXp();
}
