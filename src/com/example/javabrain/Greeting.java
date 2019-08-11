package com.example.javabrain;

public interface Greeting {
	public void perform();
	
	public default void implemented() {
		System.out.println("Example");
	}
}
