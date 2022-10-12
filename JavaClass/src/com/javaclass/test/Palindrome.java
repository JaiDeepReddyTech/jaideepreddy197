package com.javaclass.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number ");
		int num = sc.nextInt();
		if (num == palindrome(num)) {
			System.out.println("Number is a  palindrome : " + num);
		} else {
			System.out.println("Number is not a palindrome : " + num);
		}

	}

	public static int palindrome(int num) {
		int rev = 0;
		int rem;
		for (; num > 0;) {
			rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
		return rev;
	}

}
