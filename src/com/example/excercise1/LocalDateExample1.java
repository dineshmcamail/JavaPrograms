package com.example.excercise1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.LocalTime;

public class LocalDateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate localDate = LocalDate.now().plusDays(18);
		System.out.println(localDate);
		System.out.println(today);
		System.out.println(Period.between(localDate, today).getDays());
		
		LocalTime timeNow = LocalTime.now();
		LocalTime afterFewHours = LocalTime.now().plusHours(2);
		System.out.println(timeNow);
		System.out.println(afterFewHours);
		System.out.println(Duration.between(timeNow, afterFewHours).getSeconds()/3600);
		
		
		LocalDateTime whole = LocalDateTime.now();
		System.out.println(whole);
	}

}
