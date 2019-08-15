package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MariTry2 {
	
	public Map<String, Long> getTopUser(String Url) throws IOException {
		
		Map<String, Long> original = new HashMap<String, Long>();
		Map<String, Long> result = new HashMap<String, Long>();
		
		original = Files.lines(Paths.get(Url)).map(x->x.split(" ")[0])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
		
		//Ascending Order
		/*original.entrySet().stream().sorted( Map.Entry.<String, Long>comparingByValue())
						.forEachOrdered(k-> result.put(k.getKey(), k.getValue()));*/
		
		//Decending Order
		original.entrySet().stream().sorted( Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(k-> result.put(k.getKey(), k.getValue()));
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MariTry2 obj = new MariTry2();
		String fileUrl ="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\JavaPrograms\\src\\Config\\data.log";
		try {
			System.out.println(obj.getTopUser(fileUrl));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
