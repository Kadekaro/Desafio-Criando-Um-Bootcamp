import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA Avançado");
        mentoria.setDescricao("Mentoria do básico ao avançado de JAVA");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JS Avançado");
        mentoria1.setDescricao("Mentoria do básico ao avançado de JS");
        mentoria1.setData(LocalDate.now());

        Curso curso = new Curso();
        curso.setTitulo("Java Aplicado");
        curso.setDescricao("Curso de Java Aplicado");
        curso.setCargaHoraria(100);

        Curso curso1 = new Curso();
        curso1.setTitulo("JS Aplicado");
        curso1.setDescricao("Curso de JS Aplicado");
        curso1.setCargaHoraria(50);

        BootCamp bootCampJava = new BootCamp();
        bootCampJava.setNome("Bootcamp de JAVA Avançado.");
        bootCampJava.setDescricao("É um bootcamp avançado para JAVA focado em empresas.");
        bootCampJava.getConteudos().add(curso);
        bootCampJava.getConteudos().add(curso1);
        bootCampJava.getConteudos().add(mentoria);
        bootCampJava.getConteudos().add(mentoria1);

        Dev kadekaroDev = new Dev();
        kadekaroDev.setNome("Kadekaro");
        kadekaroDev.inscreverBootcamp(bootCampJava);
        kadekaroDev.progredir();
        kadekaroDev.progredir();
        kadekaroDev.progredir();
        kadekaroDev.progredir();
        System.out.println();
        System.out.println("Conteúdos finalizados por Kadekaro: " + kadekaroDev.getConteudosFinalizados());
        System.out.println("Pontos de Kadekaro: " + kadekaroDev.calcularTotalXP());

        Dev brendaDev = new Dev();
        kadekaroDev.setNome("Brenda");
        brendaDev.inscreverBootcamp(bootCampJava);
        System.out.println();
        brendaDev.progredir();
        brendaDev.progredir();
        brendaDev.progredir();
        System.out.println();
        System.out.println("Conteúdos finalizados por Brenda: " + brendaDev.getConteudosFinalizados());
        System.out.println("Pontos de XP de Brenda: " + brendaDev.calcularTotalXP());



    }
}
