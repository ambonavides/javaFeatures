package com.estudos.feature.java8._08_parallel_sort;

import java.util.Arrays;

public class ParallelArraySortingExemplo {
	public static void main(String[] args) {
		int [] meu_array = {5, 8, 1, 0, 6, 9, 50, -3};
		
		for (int i : meu_array) {
			System.out.print(i + " ");
		}
		
		/*
		 * utiliza thread para paralelização
		 * pode gerar overhead
		 * ordenando até o 5º elemento
		 */
		
		//Arrays.parallelSort(meu_array, 0, 5);
		
		Arrays.parallelSort(meu_array);
		
		System.out.println();
		
		for (int i : meu_array) {
			System.out.print(i + " ");
		}
		
	}
}
