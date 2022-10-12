package com.dsa.programs;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 7, 9, 4};
		select(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void select(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-1-i;
		int maxIndex=	getMaxIndex(arr,0,last);
		swap(arr,maxIndex,last);
		}
	}
	static void swap(int []arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	private static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}return max;
		
	}

}
