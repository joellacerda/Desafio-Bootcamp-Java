import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Bootcamp completo de Java");
        curso.setCargaHoraria(4);
//        System.out.println(curso);
//        System.out.println(curso.calcularXP());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Tira dúvidas");
        mentoria.setDescricao("Aula de tira dúvidas sobre arrays");
        mentoria.setData(LocalDate.of(2023, 4, 1));
//        System.out.println(mentoria);
//        System.out.println(mentoria.calcularXP());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Joel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Joel: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos - Joel: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos - Joel: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Maria: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos concluídos - Maria: " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos - Maria: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXP());
        dev2.progredir();
        System.out.println("Conteúdos concluídos - Maria: " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos - Maria: " + dev2.getConteudosInscritos());
        System.out.println(dev2.calcularTotalXP());
    }
}