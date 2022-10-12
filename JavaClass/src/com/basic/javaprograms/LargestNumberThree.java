package com.basic.javaprograms;

import java.util.Scanner;

public class LargestNumberThree {

	public static void main(String[] args) {
		System.out.println("Enter First Number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();
		System.out.println("Enter Thrid Number ");
		int c = sc.nextInt();
int res=(a>=b)?((a>=c)?a:c):((b>=c)?b:c);
System.out.println(res+" is larger number");
	}

}
