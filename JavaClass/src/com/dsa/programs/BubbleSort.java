package com.dsa.programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, -3, 1,8,2,-98,14,75,-26, 9, 6 };
//		int []arr= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
bubble(arr);
System.out.println(Arrays.toString(arr));
	}
public static void	bubble(int []arr){
	boolean flag;
	//run the steps n-1 times
		for(int i=0;i<arr.length;i++) {
			flag=false;
			//for each step, max item will come at the last respective index
			for (int j = 1; j < arr.length - i; j++) {
				//swap if the item is smaller than the previous item
				if (arr[j] <arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true;
				}
			}if(!flag) {
				break;
			}
		}
	}
}