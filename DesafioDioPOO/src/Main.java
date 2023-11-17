import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso(null, null);
		curso1.setTitulo("Curso Java POO");
		curso1.setDescricao("POO");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso(null, null);
		curso2.setTitulo("Curso Java Spring Boot");
		curso2.setDescricao("Framework Spring Boot");
		curso2.setCargaHoraria(8);
		
		Curso curso3 = new Curso(null, null);
		curso3.setTitulo("Curso Modelagem Relacional, Aprendendo sobre Queries e Linguagem SQL");
		curso3.setDescricao("SQL");
		curso3.setCargaHoraria(8);
		
		Curso curso4 = new Curso(null, null);
		curso4.setTitulo("Curso Criando Transações, Executando Backup e Recovery de Banco de Dados");
		curso4.setDescricao("Framework Spring Boot");
		curso4.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria(null, null);
		mentoria1.setTitulo(" Mentoria de Java Professional");
		mentoria1.setDescricao("Como ganhar dinheiro e alavancar o seus negócios com Java Professional");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria(null, null);
		mentoria2.setTitulo(" Mentoria SQL Dabatse Specialist");
		mentoria2.setDescricao("Como ganhar dinheiro e alavancar o seus negócios com SQL Database");
		mentoria2.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Formação Java Developer");
		bootcamp1.setDescricao("Formação completa Java Developer - Do Básico ao Avançado");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		Bootcamp bootcamp2 = new Bootcamp();
		bootcamp2.setNome("Formação SQL Database Specialist");
		bootcamp2.setDescricao("Formação completa QL Database Specialist - Do Básico ao Avançado");
		bootcamp2.getConteudos().add(curso3);
		bootcamp2.getConteudos().add(curso4);
		bootcamp2.getConteudos().add(mentoria2);
		
		Dev devVinny = new Dev();
		devVinny.setNome("Vinny");
		devVinny.inscreverBootcamp(bootcamp1);
		System.out.println("Conteúdos Inscritos Vinny: " + devVinny.getConteudosInscritos());
		devVinny.progredir();
		devVinny.progredir();
		devVinny.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Vinny: " + devVinny.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Vinny: " + devVinny.getConteudosConcluidos());
		System.out.println("XP: " + devVinny.calcularTotalXp());
		
		System.out.println("============================================================================================================");
		
		Dev devAdam = new Dev();
		devVinny.setNome("Adam");
		devAdam.inscreverBootcamp(bootcamp2);
		System.out.println("Conteúdos Inscritos Adam: " + devAdam.getConteudosInscritos());
		devAdam.progredir();
		devAdam.progredir();
		devAdam.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Adam: " + devAdam.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Adam: " + devAdam.getConteudosConcluidos());
		System.out.println("XP: " + devAdam.calcularTotalXp());
	}

}
