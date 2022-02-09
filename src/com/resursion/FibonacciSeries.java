package com.resursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fib(int n) {
		if(n<=0) {
			return 0;
		} else if(n == 1 || n== 2)
			return n-1;
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fib(sc.nextInt()));
	}
}
