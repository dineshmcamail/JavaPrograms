package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MurugesTry1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String URL="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\Project1\\src\\Config\\Songs.txt";
		Stream<String> txtContents = Files.lines(Paths.get(URL));
		//System.out.println(txtContents.map(x->x.split(" ")[0]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		
		
		Map<String, Long> hMap = txtContents.map(x->x.split(" ")[0]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(hMap);
		System.out.println(Collections.max(hMap.entrySet(), Map.Entry.comparingByValue()));
		
		
		String [] arr={"Arun Kumar","Dinesh Kanna","Kumar muthu","Ram singh","Srini vasala","Dinesh Kanna","Kumar muthu","Dinesh Kanna","Bala sundar"};		
		
		Map<String, Long> nameMap = Arrays.stream(arr).filter(x->x.split(" ")[0].length()>= 5).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println(nameMap);
		
		/*.forEach((x, v)->x->x.split(" ")[0]+"."+x.split(" ")[1]+"@gmail.com")
		.collect(Collectors.toList())*/
		//	nameMap.forEach((k,v)->IntStream.range(0, 3).forEach(nbr->k.split(" ")));
		
	}

}








