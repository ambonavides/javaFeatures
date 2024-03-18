package com.estudos.feature.java8._06_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Curso {
	private String nome;
	private List<Aluno> listaAlunos;
	
	public Curso(String nome, List<Aluno> listaAlunos) {
		super();
		this.nome = nome;
		this.listaAlunos = listaAlunos;
	}
	
	public Curso(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
}

class Aluno {
	
	private String nome;
	private Matricula matricula;
	private Optional<Matricula> matriculaOpt;
	
	public Aluno(String nome) {
		super();
		this.matriculaOpt = Optional.empty();
		this.nome = nome;
	}

	public Aluno(String nome, Matricula matricula) {
		super();
		this.nome = nome;
		this.matriculaOpt = Optional.empty();
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Matricula getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Optional<Matricula> getMatriculaOpt() {
		return matriculaOpt;
	}

	public void setMatriculaOpt(Matricula matriculaOpt) {
		this.matriculaOpt = Optional.of(matricula);
	}
	
}

class Matricula {
	
	private String numero;
	
	public Matricula(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}

public class OptionalExamplo {
	
	public static void main(String[] args) {
		Curso cursoAdm = new Curso("Administracao");
		cursoAdm.setListaAlunos(new ArrayList<Aluno>());
		
		Aluno jose = new Aluno("José");
		jose.setMatricula(new Matricula("11100"));
		cursoAdm.getListaAlunos().add(jose);
		
		Aluno maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("12010"));
		maria.setMatriculaOpt(new Matricula("12010"));
		cursoAdm.getListaAlunos().add(maria);
		
		Aluno ana = new Aluno("Ana");
		//aluno sem matricula intencionalmente para dar nulo
		cursoAdm.getListaAlunos().add(ana);
		
		Aluno paulo = new Aluno("Maria");
		paulo.setMatricula(new Matricula("14010"));
		paulo.setMatriculaOpt(new Matricula("14010"));
		cursoAdm.getListaAlunos().add(paulo);
		
		try {
			//irá lancar NullPointerException
			cursoAdm.getListaAlunos()
			.stream()
			.forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().getNumero()));
		}catch (NullPointerException e) {
			System.err.println("não contem a matrícula");
		}
		
		
		//contornar a exceção com optional
		//não irá lancar NullPointerException
		cursoAdm.getListaAlunos()
			.stream()
			.filter(a -> a.getMatriculaOpt().isPresent())
			.forEach(a -> System.out.println(a.getNome() + " - " + a.getMatriculaOpt().get().getNumero()));
	}

}
