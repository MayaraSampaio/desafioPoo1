import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
    Curso curso1= new Curso ();
    curso1.setTitulo("cursojava");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(0);

    Curso curso2= new Curso ();
    curso2.setTitulo("cursojs");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(0);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria);

    }
}