import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angula");
        curso2.setDescricao("Curso Angula");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria da aula de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Decrição do Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Israel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " " + dev1.getConteudosInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " " + dev1.getConteudosInscrito());
        System.out.println("Conteudos concluidos de " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println();

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de " + dev2.getNome() + " " + dev2.getConteudosInscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-------------");
        System.out.println("Conteudos Inscritos de " + dev2.getNome() + " " + dev2.getConteudosInscrito());
        System.out.println("Conteudos concluidos de " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}