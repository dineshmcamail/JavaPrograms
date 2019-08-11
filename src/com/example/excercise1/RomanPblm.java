package com.example.excercise1;

public class RomanPblm {

    public int romanToInt(String s) {
        
       String []arr = s.split("");
       int result=0;
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i].equals("M")) {
    		   if (i > 0 && arr[i - 1].equals("C")) {
					result += 900;
				}else {
					result+=1000;
				}
    	   }
    	   if(arr[i].equals("D")) {
    		   if (i > 0 && arr[i - 1].equals("C")) {
					result += 400;
				}else {
					result+=500;
				}
    	   }
    	   if(arr[i].equals("C")) {
    		   if (i > 0 && arr[i - 1].equals("X")) {
					result += 90;
    		   }else if (i+1<arr.length && (arr[i+1].equals("D") || arr[i+1].equals("M"))){
					
				}else {
					result+=100;
				}
    	   }
    	   if(arr[i].equals("L")) {
    		   if (i > 0 && arr[i - 1].equals("X")) {
					result += 40;
				}else {
					result+=50;
				}
    	   }
    	   if(arr[i].equals("X")) {
    		   if (i > 0 && arr[i - 1].equals("I")) {
					result += 9;
				}else if (i+1<arr.length && (arr[i+1].equals("L") || arr[i+1].equals("C"))){
					
				}else {
					result+=10;
				}
    	   }
    	   if(arr[i].equals("V")) {
				if (i > 0 && arr[i - 1].equals("I")) {
					result += 4;
				}else {
    			   result+=5;
    		   }
    	   }
    	   if(arr[i].equals("I")) {
    		   if(i+1<arr.length && (arr[i+1].equals("V") || arr[i+1].equals("X"))) {
    			   //
    		   }else {
    			   result+=1;
    		   }
    	   }
       }
       return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanPblm obj = new RomanPblm();
		System.out.println(obj.romanToInt("MCMXCIV"));
	}

}
