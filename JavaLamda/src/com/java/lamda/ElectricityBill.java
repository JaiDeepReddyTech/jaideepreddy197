package com.java.lamda;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Units");
		double units = sc.nextDouble();
		System.out.println("Enter pendding amount");
		double arrears = sc.nextDouble();
		sc.close();
		float intrestArr = (float) (arrears + (arrears * 0.10));
		System.out.println("***************************************");
		System.out.println("No.of units :" + units);

		System.out.println("Pending Arresars : " + arrears + "rs");
		System.out.println("Total Arrears with 10% intrest :" + intrestArr + "rs");
//	System.out.println("=======================================");
		if (units <= 50) {
			System.out.println("Totall bill : " + (intrestArr) + "rs");
		} else if ((units > 50) && (units <= 100)) {
			float unit = (float) units * 2;
			System.out.println("Total Bill for Units : " + unit + "rs");
			System.out.println("=======================================");
			System.out.println("Total bill : " + ((unit) + intrestArr) + "rs");
		} else if ((units > 100) && (units <= 150)) {
			float unit = (float) units * 5;
			System.out.println("Total Bill for Units :" + unit + "rs");
			System.out.println("=======================================");
			System.out.println("Total bill : " + ((unit) + intrestArr) + "rs");

		} else if ((units > 150) && (units <= 200)) {
			float unit = (float) units * 9;
			System.out.println("Total Bill for no.of Units : " + unit + "rs");
			System.out.println("=======================================");
			System.out.println("Total bill : " + ((unit) + intrestArr) + "rs");
		} else if (units > 200) {
			float unit = (float) units * 14;
			System.out.println("Total Bill for Units : " + unit + "rs");
			System.out.println("=======================================");
			System.out.println("Total bill : " + ((unit) + intrestArr) + "rs");
		}
		System.out.println("***************************************");
	}
}
