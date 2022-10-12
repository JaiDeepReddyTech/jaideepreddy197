package com.java.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("Jai", 24, "Male", "IT"));
		employee.add(new Employee("Ram", 27, "Male", "HR"));
		employee.add(new Employee("Arjun", 23, "Male", "IT"));
		employee.add(new Employee("Sofia", 25, "Female", "HR"));
		employee.add(new Employee("Lisa", 32, "Female", "IT"));
		employee.add(new Employee("Sivaji", 23, "Male", "IT"));
		Collections.sort(employee);
		System.out.println(employee.toString());
		for(Employee emp:employee) {
			System.out.println(emp);
		}
	List<String> lis=	employee.stream().filter(s->s.getAge()>24).map(Employee::getName).collect(Collectors.toList());
	System.out.println(lis);
	Map<String, Double> gen=employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getAge)));
	System.out.println(gen);
		employee.stream().map(Employee::getName
				).distinct().forEach(System.out::println);
//		Map<String, Long> countEmp = employee.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		System.out.println(countEmp);
//		Map<String, Double> countGender = employee.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//		System.out.println(countGender);
//		Map<String, Long> depCount = employee.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(""+depCount);
		   List list = employee.stream().filter(s -> s.getName().startsWith("S")).map(Employee::getName).collect(Collectors.toList());
		System.out.println("🙂"+list+"🙂");
//		System.out.println(employee.toString());
//		for(Employee emp :employee) {
//			System.out.println(emp);
//		}
//		for(Employee em:employee) {
//		
//			System.out.println(em);
//		
//		}
		
	}

}
