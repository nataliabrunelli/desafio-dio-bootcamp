package dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

  // Atributos
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  // Construtor
  public Bootcamp(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  // Getters e Setters
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return this.dataInicial;
  }


  public LocalDate getDataFinal() {
    return this.dataFinal;
  }


  public Set<Dev> getDevsInscritos() {
    return this.devsInscritos;
  }

  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  public Set<Conteudo> getConteudos() {
    return this.conteudos;
  }

  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  // Equals e Hashcode
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
    result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
    result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
    result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bootcamp other = (Bootcamp) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (dataInicial == null) {
      if (other.dataInicial != null)
        return false;
    } else if (!dataInicial.equals(other.dataInicial))
      return false;
    if (dataFinal == null) {
      if (other.dataFinal != null)
        return false;
    } else if (!dataFinal.equals(other.dataFinal))
      return false;
    if (devsInscritos == null) {
      if (other.devsInscritos != null)
        return false;
    } else if (!devsInscritos.equals(other.devsInscritos))
      return false;
    if (conteudos == null) {
      if (other.conteudos != null)
        return false;
    } else if (!conteudos.equals(other.conteudos))
      return false;
    return true;
  }
}
