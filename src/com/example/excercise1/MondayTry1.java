package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MondayTry1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String URL="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\Project1\\src\\Config\\Songs.txt";
		Stream<String> contents = Files.lines(Paths.get(URL));
		
		System.out.println("STEP1----------------------------------");
		Map<Object, Object> contentsMap = contents.map(e->e.split(",")).collect(Collectors.toMap(e->e[0], e->e[3]));
		Map<String, String> conMap = (Map) contentsMap;
		System.out.println(conMap);
		
		System.out.println("STEP2----------------------------------");
		String maxValue=Collections.max(conMap.entrySet(),Map.Entry.comparingByValue()).getValue();
		System.out.println(maxValue);
		
		System.out.println("STEP3----------------------------------");
		List<String> maxNames=new ArrayList<String>();
		for (Entry<String, String> entry : conMap.entrySet()) {
	        if (entry.getValue().equals(maxValue)) {
	        	maxNames.add(entry.getKey());
	        }
	    }
		
		Collections.sort(maxNames);
		System.out.println(maxNames);		
		
		/*Map<String, String> result2 = new LinkedHashMap<>();
		conMap.entrySet().stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		System.out.println("----------------------------------");
		System.out.println(result2);*/
		
		/* siva,02/19,home,120
		 * ramesh,03/19,products,100
		 */
	}

}
