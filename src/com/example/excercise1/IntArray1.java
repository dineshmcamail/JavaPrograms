package com.example.excercise1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1= new HashSet<>(Arrays.asList(3,4,2,5,6,7,8,8));
		System.out.println(s1);
		System.out.println();
		for(Integer i:s1)
			System.out.println(i%2==0?"Even-"+i:"Odd-"+i);
	}

}
