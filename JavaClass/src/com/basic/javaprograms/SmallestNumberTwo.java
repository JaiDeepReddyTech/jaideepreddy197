package com.basic.javaprograms;

import java.util.Scanner;

public class SmallestNumberTwo {

	public static void main(String[] args) {
		System.out.println("Enter First Number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();
int res=(a<b)?+a:+b;
System.out.println(res+" is Smallest number");
	}

}
