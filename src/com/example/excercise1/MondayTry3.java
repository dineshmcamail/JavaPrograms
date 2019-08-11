package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MondayTry3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String URL="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\Project1\\src\\Config\\Songs.txt";
		Stream<String> contents = Files.lines(Paths.get(URL));
		
		System.out.println(Optional.ofNullable(null));
		
		Map<String, Long> countMap = contents.map(e->e.split(",")[0]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> result2 = new LinkedHashMap<>();
		countMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
		.forEachOrdered(x->result2.put(x.getKey(), x.getValue()));
		
		
		countMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		System.out.println("----------------------------------");
		System.out.println(result2);
		
		System.out.println(Collections.max(countMap.entrySet(),Map.Entry.comparingByValue()));
		
		//Comments the above lines and execute the below line.
	//	System.out.println(contents.map(x->x.split(",")[2]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		
		Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
		Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
		
	}

}
