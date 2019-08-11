package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TryAll1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Palindrome in Java 8
		String str ="RotatoR";
		System.out.println(IntStream.range(0, str.length()/2).allMatch(x->str.charAt(x) == str.charAt(str.length() - x - 1)));
		
		//File Contents Read
		String URL="C:\\\\\\\\Users\\\\jisadp9\\\\Documents\\\\workspace-sts-3.9.3.RELEASE\\\\Project1\\\\src\\\\Config\\\\Songs.txt";
		List<String> element = Files.lines(Paths.get(URL)).collect(Collectors.toList());		
		element.stream().filter(x->x.split(" ")[0].length()>2).map(String::toUpperCase).forEach(System.out::println);
		
		
		List<String> element2 = Files.lines(Paths.get(URL)).collect(Collectors.toList());	
		System.out.println(Collections.max(element2.stream().map(x->x.split(" ")[0]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet(),Map.Entry.comparingByValue()));
		
	}

}
