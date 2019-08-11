package com.example.excercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="35";
		List<String> each = Arrays.asList(str.split(""));
		HashMap<String, String> hrMap =new HashMap<String, String>();
		hrMap.put("3","abc");
		hrMap.put("5","def");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<each.size();i++) {
			sb.append(hrMap.get(each.get(i)));				
		}
		System.out.println(sb);
		
		int a[] = new int[500];
	}

}
