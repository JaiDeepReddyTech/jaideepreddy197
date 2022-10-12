package com.basic.javaprograms;

public class Armstrong {
	public static void main(String[] args) {
		
		int input =153;

		if (isArmstrong(input)) {
			System.out.println("This is a Armstrong number");
		} else {  
			System.out.println("Not an Armstrong");
		}
//	System.out.println(countNum(input));
	}

	public static boolean isArmstrong(int input) {
		int num = input;
		int digit = 0;
		int sum = 0;
		int count = countNum(input);
		while (input > 0) {
			digit = input % 10;
			input /= 10;
			sum = sum + (int) Math.pow(digit, count);
		}
		return num == sum;
	}

	public static int countNum(int input) {
		int count = 0;
		while (input != 0) {
			input /= 10;
			count++;
		}
		return count;
		
	}
}
