package com.basic.javaprograms;
import java.util.Scanner;
public class EvenDigits {
	public static void main(String[] args) {
		Scanner jai = new Scanner(System.in);
		System.out.println("Enter  Number");
		int input = jai.nextInt();
		for (int i = 0; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
