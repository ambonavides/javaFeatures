package com.estudos.feature.java8._09_reflect;


import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

class Produto{
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		super();
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

public class ReflectExemplo {
	/**
	 * Pode-se utilizar reflexão para:
	 * Constructor
	 * Fields
	 * Method
	 * Parameter
	 * Modifier
	 */
	
	public static void main(String[] args) {
		
		//instância da classe produto
		Produto p = new Produto("Geladeira", 3000.00);
		
		//instância da clase class
		Class cl = p.getClass();
		
		//todos os métodos declarados na classe produto
		Method[] method = cl.getDeclaredMethods();
		
		for (Method m : method) {
			System.out.println(m.getName());
			
			Parameter[] params = m.getParameters();
			
			for(Parameter param : params) {
				System.out.println(param);
			}
			
		}
		
		
	}

}
