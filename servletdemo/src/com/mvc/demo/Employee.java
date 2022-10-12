package com.mvc.demo;

public class Employee {
private String firstName;
private String lastName;
private String Dept;
private double salary;
public Employee(String firstName, String lastName, String dept, double salary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	Dept = dept;
	this.salary = salary;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
