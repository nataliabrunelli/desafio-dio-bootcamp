import java.time.LocalDate;

import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso("Curso Java", "Curso de Java", 8);
    Curso curso2 = new Curso("Curso JS", "Curso de JavaScript", 4);
    Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java", LocalDate.now());

    Bootcamp bootcamp = new Bootcamp("Backend com Java", "Aprendendo backend com Java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev dev1 = new Dev("Natalia");
    dev1.inscreverBootcamp(bootcamp);
    dev1.progredir();
    dev1.progredir();
    System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos: " + dev1.getConteudosConcluidos());
    System.out.println("Total de XP: " + dev1.calcularTotalXp());

    Dev dev2 = new Dev("Fernanda");
    dev2.inscreverBootcamp(bootcamp);
    dev2.progredir();
    dev2.calcularTotalXp();
    System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos: " + dev2.getConteudosConcluidos());
    System.out.println("Total de XP: " + dev2.calcularTotalXp());

  }
}
