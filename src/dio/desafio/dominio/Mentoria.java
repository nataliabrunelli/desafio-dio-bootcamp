package dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

  // Atributos
  private LocalDate data;

  // Construtor
  public Mentoria(String titulo, String descricao, LocalDate data) {
    super.setTitulo(titulo);
    super.setDescricao(descricao);
    this.data = data;
  }

  // Getters e Setters
  public LocalDate getData() {
    return this.data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }
  
  @Override
  protected double calcularXp() {
    return XP_PADRAO + 20d;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + super.getTitulo() + "'" +
      ", descricao='" + super.getDescricao() + "'" +
      ", data='" + getData() + "'" +
      "}";
  }
}
