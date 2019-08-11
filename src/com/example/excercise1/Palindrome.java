package com.example.excercise1;

import java.util.stream.IntStream;

public class Palindrome {
	
	public static void main(String [] args) {
		String str="RotatoR";
		String str2="RotatoR";
		System.out.println(IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1))?str+" is Palindrome":"Not Palindrome");
		System.out.println(IntStream.range(0, str2.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str2.length() - i - 1))?"P":"NP");
	}

}
