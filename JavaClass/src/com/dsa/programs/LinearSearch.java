package com.dsa.programs;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {2,5,9,95,7,12,47,35,71};
int target=7;
System.out.println(search(arr, target));
	}
public static int search(int []arr,int target) {
	for(int i=0;i<arr.length-1;i++) {
		if(target==arr[i]) {
			System.out.println("Your target number is  found");
			return arr[i];
		}
	}
	return -1;
}
}
