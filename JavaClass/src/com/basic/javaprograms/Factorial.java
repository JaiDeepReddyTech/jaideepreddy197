package com.basic.javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long fc=1;
		
		for(long i=1;i<=num;i++) {
			 fc=fc*i;
		}
		System.out.println(fc);
	}

}
