package com.basic.javaprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		for (int i = 1; i < 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			if (c > 10) {
				return;
			}
			System.out.println(c);
		}

	}

}
