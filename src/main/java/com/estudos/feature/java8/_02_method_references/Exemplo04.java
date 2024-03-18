package com.estudos.feature.java8._02_method_references;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Product {
	
	private int codigo;
	private String nome;
	private Double preco;
	
	public Product(int codigo, String nome, Double preco) {
		this.codigo = codigo;
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
	
	public void imprime() {
		System.out.println(nome + " = " + preco);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}

class Print {
	
	public static void imprime (Product p) {
		System.out.println(p.getNome() + " = " + p.getPreco());
	}
	
}

class OrdenaProdutoPorPreco implements Comparator<Product>{
	public int compare(Product p1, Product p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}
}

public class Exemplo04 {
		
	public static void main(String[] args) {
		List<Product> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(new Product(1000, "Geladeira 470L", 2999.00));
		listaProdutos.add(new Product(2000, "TV UHD 50''", 3500.00));
		listaProdutos.add(new Product(1001, "TV UHD 65''", 5000.00));
		listaProdutos.add(new Product(3000, "Microondas 20L", 399.00));
		listaProdutos.add(new Product(1001, "Geladeira 120L", 900.00));
		listaProdutos.add(new Product(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
		listaProdutos.add(new Product(1002, "Geladeira 500L", 3100.00));
		
	
		List<Product> listaGeladeiras = new ArrayList<>();
		for (Product p : listaProdutos) {
			if(p.getNome().contains("Geladeira")){
				listaGeladeiras.add(p);
			}
		}
		
		//ordena a lista de geladeiras
		Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());
		
		//lista dos nomes das geladeiras
		List<String> listaNomesGeladeiras = new ArrayList<String>();
		for (Product p : listaGeladeiras) {
			listaNomesGeladeiras.add(p.getNome().toUpperCase());
		}
		
		//Existe nomes das geladeiras
		for (String nome : listaNomesGeladeiras) {
			System.out.println(nome);
		}
		
		//PIPELINE
		listaProdutos.stream()
					.filter(p -> p.getNome().contains("Geladeira"))
					.sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
					.map(p -> p.getNome().toUpperCase())
					.forEach(System.out::println);;
		
	}
	

}