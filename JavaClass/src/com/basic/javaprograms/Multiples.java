package com.basic.javaprograms;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		System.out.println("Which Table you wantr");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		
		int count=0;
for(int i=1;i<=10;i++) {
	int b=a*i;
	System.out.println(a+"*"+i+"="+b);
	count++;
	if(count==10) {
		System.out.println("===========");
		count=0;
	}
}
	}
	}

