package com.jsp.tagdemo;

public class Employee {
private String firstName;
private String lastName;
private boolean memberVip;
public Employee(String firstName, String lastName, boolean memberVip) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.memberVip = memberVip;
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
public boolean isMemberVip() {
	return memberVip;
}
public void setMemberVip(boolean memberVip) {
	this.memberVip = memberVip;
}



}
