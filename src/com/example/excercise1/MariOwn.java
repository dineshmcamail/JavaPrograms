package com.example.excercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 
 * **/

public class MariOwn {
	
	
	static List<String> getTopUsers(int n, int k){
		
		List<String> input = new ArrayList<String>();
		
		input.add("Arun 2019-01-04T12:00:35 Sales");
		input.add("Mary 2019-01-04T12:00:35 Sales");
		input.add("Mari 2019-02-04T12:00:36 Cart");
		input.add("Abi 2019-02-04T13:00:36 Catalog");
		input.add("Arun 2019-02-04T12:00:37 Products");

		List<UserClickStream> streamList = new ArrayList<>();
		
		String[] fields;		

		for(String str: input){
			
			fields = str.split(" ");
			streamList.add(new UserClickStream(fields[0], LocalDateTime.parse(fields[1]), fields[2]));
			
		}
		
		
		// Top Users count
		/*List<String> result = streamList.stream()
		 * .collect(Collectors.groupingBy(UserClickStream::getName,Collectors.counting()))
				.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
				.map(e->e.getKey()+" "+e.getValue()).limit(k).collect(Collectors.toList());*/
		
		//Top Dates count
		/*List<String> result = streamList.stream().map(u->u.getDate().toLocalDate())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().sorted(Map.Entry.<LocalDate, Long>comparingByKey().reversed())
				.map(u->u.getKey().toString()+" "+u.getValue()).collect(Collectors.toList());*/
		
		//Top Pages count
		List<String> result = streamList.stream().map(u->u.getPage())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) //Altered in this line
				.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
				.map(e->e.getKey()+" "+e.getValue()).limit(k).collect(Collectors.toList());
		
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		//N days and top kth user
		getTopUsers(2, 2).forEach(System.out::println);

	}
	
}

class UserClickStream{
	public UserClickStream(String name, LocalDateTime date, String page) {
		super();
		this.name = name;
		this.date = date;
		this.page = page;
	}


	String name;
	LocalDateTime date;
	String page;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((page == null) ? 0 : page.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserClickStream other = (UserClickStream) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		return true;
	}
}
