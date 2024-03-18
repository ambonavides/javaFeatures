package com.estudos.feature.java8._05_string_joiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringJoinerExemplo {
	
	public static void main(String[] args) {
		
		//quebrando por virgula
		String nomes = " João, Pedro, Maria, Ana, Paulo";
		
		StringTokenizer st = new StringTokenizer(nomes, ",");
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		//concatenando por virgula (caminho inverso do StringTokenizer)
		StringJoiner sj = new StringJoiner(", ");
		sj.add("João");
		sj.add("Pedro");
		sj.add("Maria");
		sj.add("Ana");
		sj.add("Paulo");
	
		System.out.println(sj);
	}

}
