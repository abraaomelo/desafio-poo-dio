import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devAbe = new Dev();
        devAbe.setNome("Abraao");
        devAbe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devAbe.getConteudosInscritos());

        Dev devSaphira = new Dev();
        devSaphira.setNome("Saphira");
        devSaphira.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devSaphira.getConteudosInscritos());



    }
}
