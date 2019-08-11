package com.example.excercise1;
public class GoogleCoding {
	public static void main(String[] args) {
		//Tooks 7 minutes to solve this problem
		// TODO Auto-generated method stub
		int[] arr = {9,9,9,9};
		int result=0;
		for(int i=0;i<arr.length;i++) {
			int cal =arr.length-1-i, multi=1;
			for(int j=1;j<=cal;j++) {
				multi=multi*10;
			}
			result = result+(arr[i] *multi);
		}
		System.out.println((result+1));
	}

}
