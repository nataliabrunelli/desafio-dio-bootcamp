package dio.desafio.dominio;

public class Curso extends Conteudo {

  // Atributos
  
  private int cargaHoraria;

  // Construtor
  public Curso(String titulo, String descricao, int cargaHoraria) {
    super.setTitulo(titulo);
    super.setDescricao(descricao);
    this.cargaHoraria = cargaHoraria;
  }

  // Getters e Setters
  public int getCargaHoraria() {
    return this.cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + super.getTitulo() + "'" +
      ", descricao='" + super.getDescricao() + "'" +
      ", carga horaria='" + getCargaHoraria() + "'" +
      "}";
  }

  @Override
  protected double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }
}
