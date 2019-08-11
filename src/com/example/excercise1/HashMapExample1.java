package com.example.excercise1;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		HashMap<Employee, String> hMap = new HashMap<Employee, String>();
		hMap.put(emp1, "Nanguski");
		hMap.put(emp2, "Languski");		
		
		System.out.println(hMap.size());
		
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		
		HashMap<Integer, String> hMap2 = new HashMap<Integer, String>();
		
		hMap2.put(n1, "Jimmiki");
		hMap2.put(n2, "Kammal");
		
		System.out.println(hMap2.size());

	}

}

class Employee{
	int i;
	public Employee(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
}
