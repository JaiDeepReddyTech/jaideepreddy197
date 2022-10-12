package com.java.lamda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lamda {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your age");
//		int name=sc.nextInt();
//		System.out.println("Your age is : "+name);
//	for(int i=0; i<=3;i++) {
//		System.out.println("Enter Names");
//		obj.add(sc.next());
//	}

		List<String> obj = new ArrayList<String>();		
	
		obj.add("Ram");
		obj.add("Jai");
		obj.add("Ajay");
		obj.add("Rolex");
		obj.add("Santhanam");
		System.out.println(obj.size());
		System.out.println(obj);
		obj.remove(0);
		obj.add(0, "Vikram");
		System.out.println(obj.size());
		for (String names : obj) {
			System.out.println(names);
		}

		Sample rectangle = (a,b) -> System.out.println("I'm able to draw rectangle");
		rectangle.draw(10,1);
		Sample circle=(a,b)-> System.out.println("Circle");
		circle.draw(5,4);
	}

}
