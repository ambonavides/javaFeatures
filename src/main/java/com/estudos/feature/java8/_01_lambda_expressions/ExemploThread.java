package com.estudos.feature.java8._01_lambda_expressions;

public class ExemploThread {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 em execução");
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> System.out.println("Thread 2 em execução"));
		t2.start();
		
	}

}
