package com.example.excercise1;

import java.util.HashMap;
import java.util.stream.Stream;

public class TwoSumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num = {2,5,7,8,9};
		int sum=9;
		int remaining = 0;
		int firstValue=0;
		HashMap<Integer, Integer> hrMap = new HashMap<Integer, Integer>();
		for(Integer i:num) {		
			if(hrMap.containsKey(i)){
				System.out.println(hrMap.get(i)+", "+i);
			}
			hrMap.put((sum-i),i);
			firstValue=i;
		}
		System.out.println(hrMap);
		
	}

}
