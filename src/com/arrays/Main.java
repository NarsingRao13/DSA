package com.arrays;

import java.util.Scanner;

public class Main {
	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {
		OneDArray oneDArray = new OneDArray(10);
		oneDArray.traverseArray();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		int n = 0;
		while (n >= 0) {
			System.out.println("Avaliable options");
			System.out.println("Search 0");
			System.out.println("exit -1");
			System.out.println("provide the options");
			n = sc.nextInt();
			switch (n) {
				case 0: {
					System.out.println("Enter the element you want to search: ");
					System.out.println(obj.searchElement(arr, sc.nextInt()));
					break;
				}
				default : System.out.println("Enter valid option");
			}
		}
		System.out.println("Exiting");
		sc.close();
	}

	public String searchElement(int[] arr, int element) {
		if (arr.length == 0) {
			return "Array has no elements";
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == element) {
					return "Element found at index " + i;
				}
			}
			return element + " is not in the array";
		}
	}
}
