package com.estudos.feature.java8._01_lambda_expressions;

import java.util.ArrayList;
import java.util.List;

class Produto {
	
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}

public class Exemplo01 {
		
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		//lambda expression com argumentos
		lista.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
		
		//ordenando a lista
		lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		
		//exibindo a lista ordenda
		lista.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));
		
		//utilizando multiplos métodos
		lista.forEach((p) -> {
			System.out.println(p.getNome());
			System.out.println(p.getPreco());
		});
	}
	

}
