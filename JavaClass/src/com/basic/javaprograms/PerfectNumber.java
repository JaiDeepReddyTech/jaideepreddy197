package com.basic.javaprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number..");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (isPerfect(input)) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
	}

	public static boolean isPerfect(int num) {

		int sum = 0;
		for (int i = 1; i <= num - 1; i++) {
			if (num % i == 0) {
				sum += i;
				System.out.println(i);
			}
		}
	
		return sum == num;
	}
}
