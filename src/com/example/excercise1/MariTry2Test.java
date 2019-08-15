package com.example.excercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MariTry2Test {
	
	MariTry2 obj = new MariTry2();
	String fileUrl ="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\Project1\\src\\Config\\data.log";
	
	@Test
	public void getTopUserTest1() throws IOException {
		Map<String, Long> output= new HashMap<String, Long>();
		output.put("arun", (long) 1);
		
		assertEquals(output, obj.getTopUser(fileUrl));
		
	}
	
	@Test
	public void getTopUserTest2() throws IOException {
		Map<String, Long> upperCaseoutput= new HashMap<String, Long>();
		upperCaseoutput.put("ARUN", (long) 1);
		
		assertEquals(upperCaseoutput, obj.getTopUser(fileUrl));
		
	}
	
	
	@Test
	public void checkNullTest() throws IOException {
		assertNotNull(obj.getTopUser(fileUrl));
	}
	
	//Invalid path, Input size check, 


}
