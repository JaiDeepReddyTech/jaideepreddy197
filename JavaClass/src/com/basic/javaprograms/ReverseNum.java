package com.basic.javaprograms;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		if (num == rev(num)) {
//			System.out.println(rev(num)+" Number Reversed");
//		} else {
//			System.out.println(rev(num)+" Number Not Reversed");
//		}
		System.out.println("Given Number :"+num+"\nReverse Number :"+rev(num));

	}

public	static int rev(int n) {
		int reverse = 0;
		while (n > 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;

			n /= 10;
		}
		return reverse;
	}
}
