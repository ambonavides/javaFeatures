package com.estudos.feature.java8._02_method_references;

interface Figura2D_2 {
	Retangulo_2 desenha(Double largura, Double altura);
}

class Retangulo_2 {
	public Retangulo_2(Double largura, Double altura) {
		System.out.println("Desenha retângulo de Largura: " + largura + "e Altura: " + altura);
	}
}

public class Exemplo01_2 {
	
	public static void main(String[] args) {
		
		Figura2D_2 fig1 = Retangulo_2::new;
		
		fig1.desenha(10.0, 2.5);
	}

}
