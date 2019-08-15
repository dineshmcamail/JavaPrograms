package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArunavaTry1 {
	
	public Map<String, Long> getTopUser(String Url) throws IOException {
		
		Map<String, Long> original = new LinkedHashMap<String, Long>();
		Map<String, Long> result = new LinkedHashMap<String, Long>();
		
		LocalDate dateCompare = LocalDate.parse("2019-01-04");
		
		original = Files.lines(Paths.get(Url)).map(x->x.split(" "))
				.filter(x->LocalDate.parse(x[1]).isEqual(dateCompare))
				.map(x->x[0])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
		
		//After getting the count
		System.out.println(original);
		
		//Get date wise Max
		System.out.println(Collections.max(original.entrySet(), Map.Entry.comparingByValue()));
		
		
		//Sorting the Map by Value Ascending Order with Limit Option
		original.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()).limit(2)
		.forEachOrdered(x->result.put(x.getKey(), x.getValue()));
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArunavaTry1 obj = new ArunavaTry1();
		String fileUrl ="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\JavaPrograms\\src\\Config\\data.log";
		try {
			System.out.println(obj.getTopUser(fileUrl));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
