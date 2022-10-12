package com.basic.javaprograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		isStrong(input);
		if (isStrong(input)) {
			System.out.println(input + ": Strong Number");
		} else {
			System.out.println(input + ": Not a Strong Number");
		}

	}

	public static boolean isStrong(int input) {
		int num = input;
		int sum = 0;
		while (input > 0) {
			int fc = 1;
			int digit = input % 10;
			input /= 10;
			for (int i = 1; i <= digit; i++) {
				fc = fc * i;
			}

			sum = sum + fc;
		

		}
		return sum == num;

	}
}
