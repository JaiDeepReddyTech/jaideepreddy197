package com.java.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMarks {
	private int rollNum;
	private String name;
	private int marks;

	public StudentMarks(int rollNum, String name, int marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

class StudentMain {
	public static void main(String[] args) {
		List<StudentMarks> student = new ArrayList<>();
		student.add(new StudentMarks(43574354, "Jai", 84));
		student.add(new StudentMarks(34346425, "Jack", 42));
		student.add(new StudentMarks(46464436, "Sofia", 37));
		student.add(new StudentMarks(79515615, "Layan", 58));
		student.add(new StudentMarks(34898631, "Anna", 78));
		List studentList = student.stream().filter(s -> s.getMarks() > 70).map(StudentMarks::getName)
				.collect(Collectors.toList());
		System.out.println(studentList);
	Map<String,Long> stuNam	=student.stream().collect(Collectors.groupingBy(StudentMarks::getName,Collectors.counting()));
	System.out.println(stuNam);
	}
}