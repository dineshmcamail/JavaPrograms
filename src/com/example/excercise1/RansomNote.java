package com.example.excercise1;

import java.util.HashMap;

public class RansomNote {
	
	 public boolean canConstruct(String ransomNote, String magazine) {
		 if(ransomNote.length()==0) return true;
		 if(magazine.length()==0) return false;
		 
		 HashMap<String, Integer> ransomHm =new HashMap<String, Integer>();
		 HashMap<String, Integer> magazineHm =new HashMap<String, Integer>();
		 
		 String[] mArr=magazine.split("");
		 for(int i=0;i<mArr.length;i++) {
			 if(magazineHm.containsKey(mArr[i])) {
				 magazineHm.put(mArr[i], magazineHm.get(mArr[i])+1);
			 }else {
				 magazineHm.put(mArr[i], 1); 
			 }
		 }
		 
		 String[] rArr=ransomNote.split("");
		 for(int i=0;i<rArr.length;i++) {
			 if(ransomHm.containsKey(rArr[i])) {
				 ransomHm.put(rArr[i], ransomHm.get(rArr[i])+1);
			 }else {
				 ransomHm.put(rArr[i], 1); 
			 }
		 }
		 
		 return ransomHm.entrySet().stream().allMatch(e->magazineHm.get(e.getKey())!=null && magazineHm.get(e.getKey())>=e.getValue());
		
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote obj = new RansomNote();
		System.out.println(obj.canConstruct("a", "b"));
	}

}
