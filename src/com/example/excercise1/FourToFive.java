package com.example.excercise1;

public class FourToFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start =4;
		int till=45;
		int count =0;
		
		for(int i=start;i<till;i++) {
			if(i/10>1) {
				if(i/100>1) {
					int d =i/100;
					int r =i%100;
					int r1=r/10;
					if(d%2!=0 || r%2!=0) {
						count++;
					}
				}else {
					int d =i/10;
					int r =i%10;
					if(d%2!=0 && r%2!=0) {
						count++;
					}
					
				}
			}else {
				if(i%2==0) {
					count++;
				}else {
					
				}
			}
		}
		
		
		System.out.println(count);
	}

}
