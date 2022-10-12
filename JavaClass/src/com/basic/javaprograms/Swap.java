package com.basic.javaprograms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		System.out.println("Enter First Number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 6
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();// 7
		a = a + b;// 13
		b = a - b;// 6
		a = a - b;// 7

		System.out.println("After Swaping \na:" + a + "\tb:" + b);

	}

}
