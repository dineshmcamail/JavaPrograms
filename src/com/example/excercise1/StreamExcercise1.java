package com.example.excercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExcercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("raj","Kamal",35),
				new Person("Kana","Rajan",22),new Person("Gandhi","Arul",42),new Person("Dinu","Raman",16),
				new Person("Sugumar","Kala",30),new Person("Manju","Dhas",21),new Person("Mohamad","Mun",36));
		
	//	people.forEach(System.out::println); //Lambda approach
		
		people.stream().filter(p-> p.getfName().startsWith("D")).forEach(p->System.out.println(p.getfName()));
		
		Stream<Person> str = people.stream();  // DO Nothing
		
		
		System.out.println(people.stream().filter(p->p.getlName().startsWith("R")).count());
	}

}
