package com.example.excercise1;

public class MondayTry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="APPLE";
		String str2="LEAPP";
		
		System.out.println(str1+str1);
		if(str1.length()==str2.length() && (str1+str1).contains(str2)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}

	}

}
