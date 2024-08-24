import java.time.LocalDate;

import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Curso Java", "Curso de Java", 8);
    Curso curso2 = new Curso("Curso JS", "Curso de JavaScript", 4);
    Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java", LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);
  }
}
