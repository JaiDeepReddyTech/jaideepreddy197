package com.mvc.demo;

public class StudentInfo {
private String firstName;
private String lastName;
private String email;
private String location;
public StudentInfo(String firstName, String lastName, String email, String location) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.location = location;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
