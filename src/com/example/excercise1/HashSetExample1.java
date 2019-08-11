package com.example.excercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class HashSetExample1 {
	
	public static void main(String [] args) {
		String [] pair_left = {"john", "mick", "damy","john","john","ab", "a"};
        String [] pair_right = {"vicky", "tyson", "will","vicky","bon","c", "bc"};
        
        HashSet<String> hs = new HashSet<String>();
        List<String> ls= new ArrayList<String>();
        int sum=0;
        for (int i = 0; i < 7; i++) {
        	if(hs.contains(pair_left[i]+pair_right[i])) {        	
        		System.out.println(sum);
        	}else {
        		sum++;
        		System.out.println(sum);
        	}
        	hs.add(pair_left[i]+pair_right[i]);
        }
        
        
            System.out.println("Array : ");
            int [] arrList = IntStream.range(2, 5+1).filter(a->a%2!=0).toArray();
            for(int i=0;i<arrList.length;i++) {
            	System.out.println("Array : "+arrList[i]);
            }
           
            divide(4,0);
            
	}
	
	public static int divide(int a, int b) {
		int c=-1;
		try {
			c=a/b;
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Finally");
		}
		return c;
	}

}
