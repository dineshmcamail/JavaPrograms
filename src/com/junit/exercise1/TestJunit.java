package com.junit.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestJunit {

	public String msg = "Hello World!"; //Expected
	
	MessageUtil obj = new MessageUtil(msg+"!");
	
	@Test
	public void printMessageTest() {
		assertEquals(msg+"!", obj.printMessage());	//Expected vs Actual
	}
	
	@Test
	public void numberCalcTest() {
		assertFalse(obj.numberCalc(5, 5) > 25);	//Assert False Example
	}
	
	@Test
	public void checkNullTest() {
		assertNotNull(obj.checkNull("JUNit"));
	}

}
