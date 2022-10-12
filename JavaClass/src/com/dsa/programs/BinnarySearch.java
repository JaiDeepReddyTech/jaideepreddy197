package com.dsa.programs;

import java.util.Arrays;

public class BinnarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 6, 5, 24, 36, 27, 32 };
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		int target = 24;
		System.out.println(search(arr, target));
		
	}
	public static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			boolean ad=arr[start]<arr[end];			
				if(ad) {
					if(arr[mid]<target) {
						start=mid+1;
					}else {
						end=mid-1;
					}
				}else {
					if(arr[mid]>target) {
						start=mid+1;
						
					}else {
						end=mid-1;
					}
				}			
		}return -1;
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
