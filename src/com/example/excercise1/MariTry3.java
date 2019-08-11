package com.example.excercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MariTry3 {
	
	public List<Student> getTopUser(String Url) throws IOException {
		
		List<String> contents = Files.lines(Paths.get(Url)).collect(Collectors.toList());
		
		List<Student> studentsList = new ArrayList<Student>();
		String [] splits;
		
		for(String element: contents) {
			splits = element.split(" ");
			studentsList.add(new Student(splits[0], LocalDateTime.parse(splits[1]), splits[2]) );
		}
		
		Collections.sort(studentsList, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getName().compareTo(s2.getName());
			}
			
		});
		
		return studentsList;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MariTry3 obj = new MariTry3();
		String fileUrl ="C:\\\\Users\\jisadp9\\Documents\\workspace-sts-3.9.3.RELEASE\\Project1\\src\\Config\\data.log";
		try {
			List<Student> studentsList = obj.getTopUser(fileUrl);
			for(Student s: studentsList) {
				System.out.println(s.getName()+"-"+s.getDateTime()+"-"+s.getPage());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Student {
	
	private String name;
	private LocalDateTime dateTime;
	private String page;
	
	public Student(String name, LocalDateTime dateTime, String page) {
		super();
		this.name=name;
		this.dateTime=dateTime;
		this.page=page;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
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
		Student other = (Student) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
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
