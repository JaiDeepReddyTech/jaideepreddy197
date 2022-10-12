package com.jai.springdemo.mvc;

public class Employee {
	private int id;
private String fristName;
private String lastName;
private String dept;

 public Employee(){
	
}
 

public Employee(int id, String fristName, String lastName, String dept) {
	super();
	this.id = id;
	this.fristName = fristName;
	this.lastName = lastName;
	this.dept = dept;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFristName() {
	return fristName;
}

public void setFristName(String fristName) {
	this.fristName = fristName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", dept=" + dept + "]";
}
 
}
