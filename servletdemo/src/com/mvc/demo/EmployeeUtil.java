package com.mvc.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Shivaji", "Yara", "IT", 25400));
		employees.add(new Employee("Jaideep", "Reddy", "HR", 65400));
		employees.add(new Employee("Layan", "Nakho", "IT", 45000));
		employees.add(new Employee("John", "Rawath", "IT", 28800));
		employees.add(new Employee("Sai", "Katakam", "HR", 23600));
		return employees;
	}
}
