package com.example.excercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseJava7Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("raj","Kamal",35),
				new Person("Kana","Rajan",22),new Person("Gandhi","Arul",42),new Person("Dinu","Raman",16));
		
		List<Person> people2 = Arrays.asList(new Person("raj","Kamal",35),
				new Person("Kana","Rajan",21),new Person("Gandhi","Arul",43),new Person("Dinu","Raman",11));
		
		//Sort by lname	with Comparator				
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person a1, Person a2) {
				return a1.getlName().compareTo(a2.getlName());
			}
			
		});
		System.out.println("Sort by lname	with Comparator");
		System.out.println(people);
		
		//Sort by lname	with Comparaable
		Collections.sort(people2);
		System.out.println(people2);
		
		//Print all elements in the list
		printAll(people);
		
		//print all people that have lname beginning with R
		printOnlyR(people,new Condition() {

			@Override
			public boolean check(Person p) {
				// TODO Auto-generated method stub
				return p.getlName().startsWith("R");
			}
			 
		});
		
	}
	
	private static void printAll(List<Person> people) {		
		for(Person p:people) {
			System.out.println(p);
		}
	}
	
	private static void printOnlyR(List<Person> people, Condition condition) {
		for(Person p:people) {
			if(condition.check(p))
			System.out.println(p);
		}
	}
	
	interface Condition{
		boolean check(Person p);
	}

}
