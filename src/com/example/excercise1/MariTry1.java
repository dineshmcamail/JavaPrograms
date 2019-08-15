package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MariTry1 {
	
	public String getTopUser(String Url) throws IOException {
		return Collections.max((Files.lines(Paths.get(Url)).map(x->x.split(" ")[0])
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) )
				.entrySet(),Map.Entry.comparingByValue()).getKey();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MariTry1 obj = new MariTry1();
		String fileUrl ="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\JavaPrograms\\src\\Config\\data.log";
		try {
			System.out.println(obj.getTopUser(fileUrl));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
