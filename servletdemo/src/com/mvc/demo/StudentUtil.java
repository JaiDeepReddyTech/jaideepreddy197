package com.mvc.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {

	public static List<StudentInfo> getStudents(){
		List<StudentInfo> students=new ArrayList<>();
		students.add(new StudentInfo("Layan", "Nakho", "layan@gmail.com", "Jordan"));
		students.add(new StudentInfo("Jai", "Jack", "jai@gmail.com","India"));
		students.add(new StudentInfo("Oman", "Nakho", "oman@gmail.com", "Jordan"));
		students.add(new StudentInfo("John", "David", "john@gmail.com", "Iran"));
		return students;
	}
}
