package com.example.excercise1;

import java.util.function.BiConsumer;

public class ExceptionHandlingInLambda {
	
	public static void main(String [] args) {
		int [] numbers = {1,2,4,5};
		int key =0;
		
		//Firstway
		process(numbers, key, (p, k) -> {
		try {	
			System.out.println(p/k);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		});
		
		//Secondway
		process(numbers, key, wrapperLambda((p, k) ->{
			try {	
				System.out.println(p/k);
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic in Wrapper Lambda Exception");
			}
			}));
		
		
		//Thirdway
		process(numbers, key, wrapperLambda2((p, k) ->System.out.println(p/k)));
		
	}
	
	static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:numbers) {
			consumer.accept(i, key);
			;
		}
	}
	
	
	static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return consumer;
	}
	
	
	static BiConsumer<Integer, Integer> wrapperLambda2(BiConsumer<Integer, Integer> consumer) {
		return (p,k) -> {
		try {
			 System.out.println(p/k);
		}catch(ArithmeticException e) {
			System.out.println("Wrapper Lambda 2 Exception");
		}
		};
	}

}
