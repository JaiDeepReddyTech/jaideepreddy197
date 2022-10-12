package com.basic.javaprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Year");
		 int input=sc.nextInt();
		 if((input%400==0)||((input%4==0)&&(input%100!=0))) {
			 System.out.println(input+" is  Leap Year");
		 }else {
			 System.out.println(input+" Not a Leap year");
		 }

	}

}
