package com.example.excercise1;

public class LargestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c= {'a','b','d','f','k','l','m','n','o','p','r','t','x','u','v'};
		
		for (int i = 1; i < c.length; i++) {
			if (c[i] < c[i - 1]) {
				System.out.println("Given array is not in Alphabatical Order. "+c[i] + "   - " + i);
			}
			
			if (c[i]-1 == c[i - 1]) {
				//System.out.println((int)c[i]);
				System.out.println(c[i-1]);
				
			}
						
		}
	}
}
