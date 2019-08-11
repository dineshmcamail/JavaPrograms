package com.example.excercise1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.*;

public class StreamOperationExercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Stream of Strings
		Stream.of("One", "two", "three").filter(x->x.startsWith("t")).sorted().forEach(System.out::println);
		
		//Stream of Integers
		Arrays.stream(new int[] {2,4,6,8,10}).map(x->x*x).average().ifPresent(System.out::println);
		
		//Streams on List with .map() method
		List<String> str = Arrays.asList("Cubs", "Lion", "Tiger", "Cat", "Lion","Tiger", "Tiger");
		str.stream().map(String::toUpperCase).findFirst().ifPresent(System.out::println);
		
		//Streams on Files
		String URL="C:\\\\\\\\Users\\\\jisadp9\\\\Documents\\\\workspace-sts-3.9.3.RELEASE\\\\Project1\\\\src\\\\Config\\\\Songs.txt";
		Stream<String> Songs = Files.lines(Paths.get(URL));
		Songs.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------");
		List<Stream<String>> listVal = Arrays.asList(Files.lines(Paths.get(URL)));
		listVal.forEach(x->x.filter(z->z.length()>15).forEach(System.out::println));
		
		//getMax Count
		System.out.println("---------------------------------------------------");
		Stream<String> line = (Files.lines(Paths.get(URL)));
		//line.filter(x->x.split(" ")[0].length()>4).forEach(System.out::println);
		//line.close();
		
		System.out.println("---------------------------------------------------");
		
		List<String> filt=line.filter(x->x.length()>0).collect(Collectors.toList());
		System.out.println(filt.stream()
					.map(x->x.split(" ")[0])
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println("------------------------Very Important Logic---------------------------");
		List<String> nameList = Files.lines(Paths.get(URL)).filter(x->x!=null).collect(Collectors.toList());
		
		Map<String, Long> nameMap = nameList.stream()
				.map(x-> x.split(" ")[0])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
		
		System.out.println("User which has More Entry is : "+Collections.max(nameMap.entrySet(),Map.Entry.comparingByValue()));
		
/*		operations:
			1. split
			2. take each count
			3. get max count*/
	}

}
