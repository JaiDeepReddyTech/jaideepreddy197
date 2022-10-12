package com.jai.springdemo.mvc;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
public static void main(String[] args) {
	List <Employee> emp=new ArrayList<>();
	emp.add(new Employee(546,"jhgjhv","gjgjj","khk"));
	emp.add(new Employee(485,"jjb","gjgjj","khk"));
	emp.add(new Employee(584,"jhgjbnbhv","jgg","khk"));
	emp.add(new Employee(565,"jhgjjjghv","nvgh","kk"));
	System.out.println(	emp.toString());
//	for(Employee temp:emp) {
//		System.out.println(temp);
//	}
}
}
