package com.example.excercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class UnitExerciseJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("raj","Kamal",35),
				new Person("Kana","Rajan",22),new Person("Gandhi","Arul",42),new Person("Dinu","Raman",16));
		
		List<Person> people2 = Arrays.asList(new Person("raj","Kamal",35),
				new Person("Kana","Rajan",21),new Person("Gandhi","Arul",43),new Person("Dinu","Raman",11));
		
		//Sort by lname	with Comparator				
		Collections.sort(people, (p1, p2) -> p1.getlName().compareTo(p2.getlName()));   //Very Important Line
		
		//Print all elements in the list
		printOnlyR(people, p -> true);
		
		System.out.println("--------------------------------");
		//print all people that have lname beginning with R
		printOnlyR(people,p1 -> ((Person) p1).getlName().startsWith("R"));
		
		
		System.out.println("--------------------------------");
		//print all people that have lname beginning with A with Predicate
		printOnlyR(people,p1 -> ((Person) p1).getlName().startsWith("A"));
		
		
		System.out.println("--------------------------------");
		//print all people with Supplier
		printAllSupplier(people, p1 -> System.out.println(p1));
		
	}
	
	private static void printAll(List<Person> people) {		
		for(Person p:people) {
			System.out.println(p);
		}
	}
	
	private static void printAllSupplier(List<Person> people, Consumer consumer) {			
		for(Person p:people) {
			consumer.accept(p);
		}
	}
	
	private static void printOnlyR(List<Person> people, Condition condition) {
		for(Person p:people) {
			if(condition.check(p))
			System.out.println(p);
		}
	}
	
	private static void printOnlyA(List<Person> people, Predicate condition) {
		for(Person p:people) {
			if(condition.test(p))
			System.out.println(p);
		}
	}
	
	interface Condition{
		boolean check(Person p);
	}

}
