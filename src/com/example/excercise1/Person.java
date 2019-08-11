package com.example.excercise1;

public class Person implements Comparable<Person>  {
	
	private String fName;
	private String lName;
	private int age;
	
	public Person(String fname, String lname, int age) {
		// TODO Auto-generated constructor stub
		this.fName=fname;
		this.lName=lname;
		this.age=age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person arg) {
		// TODO Auto-generated method stub
		return this.age - arg.age;
	}

}
