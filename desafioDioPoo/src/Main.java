import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRodrigo = new Dev();
		devRodrigo.setNome("Rodrigo");
		devRodrigo.inscreverbootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
		devRodrigo.progredir();
		devRodrigo.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Rodrigo: " + devRodrigo.getConteudosConcluidos());
		System.out.println("XP: " + devRodrigo.calcularTotalXp());
		
		System.out.println("---------");
		
		Dev devJao = new Dev();
		devJao.setNome("Jão");
		devJao.inscreverbootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Jão: " + devJao.getConteudosInscritos());
		devJao.progredir();
		devJao.progredir();
		devJao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Jão: " + devJao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Jão: " + devJao.getConteudosConcluidos());
		System.out.println("XP: " + devJao.calcularTotalXp());
;	}

}
