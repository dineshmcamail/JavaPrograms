package com.example.excercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("raj","Kamal",22),
				new Person("Kana","Rajan",22),new Person("Gandhi","Arul",22),new Person("Dinu","Raman",22));
		
		//Sort by lname					
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person a1, Person a2) {
				return a1.getlName().compareTo(a2.getlName());
			}
			
		});
		
		//Print all elements in the list
		printAll(people);
		
		//print all people that have lname beginning with R
		printOnlyR(people);
		
	}
	
	private static void printAll(List<Person> people) {		
		for(Person p:people) {
			System.out.println(p);
		}
	}
	
	private static void printOnlyR(List<Person> people) {
		for(Person p:people) {
			if(p.getlName().startsWith("R"))
			System.out.println(p);
		}
	}

}
