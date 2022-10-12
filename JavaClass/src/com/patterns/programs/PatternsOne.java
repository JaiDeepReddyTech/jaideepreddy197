package com.patterns.programs;

public class PatternsOne {

	public static void main(String[] args) {
		pattern1(5);

	}

	public static void pattern1(int n) {
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		for (int row = 0; row < n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
//		* * * * * 
		for (int row = 0; row < n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		for (int row = 0; row < 2*n; row++) {
			int totalColumns=row>n?2*n-row:row;
			for (int col = 0; col <totalColumns; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
