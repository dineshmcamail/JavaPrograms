package com.example.excercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Program to sort by 2nd letter of Last name.
public class ArunavaTry2 {
	
	public List<Emp> getSorted(List<Emp> inputList) {
		
		Collections.sort(inputList, new Comparator<Emp>() {
			
			@Override
			public int compare(Emp lName1, Emp lName2) {
				return lName1.getlName().split("")[1].compareTo(lName2.getlName().split("")[1]);
			}
			
		});
		
		return inputList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> inputList = Arrays.asList(new Emp("John", "Dbvid"),
				new Emp("Mike", "Tyson"),
				new Emp("Rob","Sherry"),
				new Emp("Angeline", "Jones"),
				new Emp("Micky", "Mouse"), 
				new Emp("David", "Baxter"));
		ArunavaTry2 obj = new ArunavaTry2();
		List<Emp> result = obj.getSorted(inputList);
		
		for(Emp emp: result) {
			System.out.println(emp.getfName().toUpperCase()+"-"+emp.getlName().toUpperCase());
		}
	}

}

class Emp{
	
	private String fName;
	private String lName;
	
	public Emp(String fName, String lName) {
		// TODO Auto-generated constructor stub
		this.fName=fName;
		this.lName=lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
