package com.example.excercise1;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.println(i%3==0?i%5==0?"Fizz-Buzz":"Fizz":i%5==0?"Buzz":i);
		}

	}

}
