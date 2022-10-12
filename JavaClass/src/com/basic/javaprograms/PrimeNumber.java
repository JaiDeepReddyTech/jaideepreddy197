package com.basic.javaprograms;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println();
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
//		 
		if(num%i==0) {
			flag=false;
			break;
		}
	}
	if(flag) {
		System.out.println(num+":is a prime number");
	}else {
		System.out.println(num+":is a Not a prime number");
	}
}
public void isprimenum(int num) {
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
	
	}
}
}