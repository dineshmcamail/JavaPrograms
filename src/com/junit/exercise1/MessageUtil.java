package com.junit.exercise1;
/*
* This class prints the given message on console.
*/

public class MessageUtil {

	private String message;

	// Constructor
	// @param message to be printed

	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	
	public int numberCalc(int i, int j) {
		return i * j;
	}
	
	public String checkNull(String s) {
		return s.equals("JUNIT")?s:null;
	}
}