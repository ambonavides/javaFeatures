package com.estudos.feature.java8._02_method_references;

interface Fig2D {
	public void desenha();
}

class Fig2DConcrete {

	public static void desenha() {
		System.out.println("Desenha figura method reference");
	}
}

public class Exemplo03 {
	public static void main(String[] args) {
		
		//classe anônima
		Fig2D fig1 = new Fig2D() {
			@Override
			public void desenha() {
				System.out.println("Desenha figura por classe anônima");
			}
		};
		fig1.desenha();
		
		//lambda expression
		Fig2D fig2 = () -> System.out.println("Desenha figura por lambda expression");
		fig2.desenha();
		
		//Method reference
		Fig2D fig3 = Fig2DConcrete::desenha;
		fig3.desenha();
		
		
	}
}
