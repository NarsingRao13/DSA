package com.arrays;

public class OneDArray {
	int arr[] = null;

	public OneDArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void traverseArray() {
		try {
			for (int value : arr) {
				System.out.print(value + " ");
			}
		} catch (Exception e) {
			System.out.println("Array no longer exits");
		}
	}
	
	
}
