package com.example.excercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="arrmadam";
		//System.out.println(IntStream.range(0, s.length()/2).allMatch(x->s.charAt(x) == s.charAt(s.length() - x - 1)));
		
		List<String> palindromes=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			int len=s.length();
			while(len>i) {
				StringBuffer subStr=new StringBuffer();
				subStr.append((s.substring(i,len)));

				if(subStr.reverse().toString().equals((s.substring(i,len))) && subStr.length()>1) {
					palindromes.add(s.substring(i,len));
					System.out.println("Match =="+s.substring(i,len));
				}				
				len--;
			}
		}
		System.out.println(palindromes.stream().max(Comparator.comparingInt(String::length)));
		
	}

}
