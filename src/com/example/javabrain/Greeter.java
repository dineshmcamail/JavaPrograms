package com.example.javabrain;

public class Greeter {
	public void great(Greeting greeting) {
		greeting.perform();
		greeting.implemented();
	}
	public static void main(String s[]) {
		Greeter greeter = new Greeter();
		RainbowGreeting rg = new RainbowGreeting();
		greeter.great(rg);
		
		//Java 8 Code Below:
		Greeting myLambdaFunction = () -> System.out.println("This is Java 8 Greeting !");
		myLambdaFunction.perform();
	}
}

@FunctionalInterface
interface Square 
{ 
    void calculate(int x); 
} 

