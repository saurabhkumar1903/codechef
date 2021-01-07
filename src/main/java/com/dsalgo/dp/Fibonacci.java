package com.dsalgo.dp;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		int memoArray[] = new int[n + 1];
		Arrays.fill(memoArray, -1);

		System.out.printf("Fibo %s : %s\n", n, findFibonacci(n, memoArray));
		extracted(memoArray);
	}

	private static int findFibonacci(int n, int[] memoArray) {
		System.out.print("n:" + n + " ");
		extracted(memoArray);

		System.out.println();

		if (-1 != memoArray[n]) {
			System.out.printf("cache hit...for %s:%s\n", n, memoArray[n]);
			extracted(memoArray);
			return memoArray[n];
		}

		if (n == 1) {
			memoArray[n] = 1;
			System.out.printf("static hit...for %s:%s\n", n, memoArray[n]);
			System.out.printf("Found value fibo %d=%d\n", n, memoArray[n]);
			extracted(memoArray);
			System.out.println();
			return memoArray[n];
		}
		if (n == 0) {
			memoArray[n] = 0;
			System.out.printf("static hit...for %s:%s\n", n, memoArray[n]);
			System.out.printf("Found value fibo %d=%d\n", n, memoArray[n]);
			extracted(memoArray);
			System.out.println();
			return memoArray[n];
		}

		int result = findFibonacci(n - 1, memoArray) + findFibonacci(n - 2, memoArray);
		memoArray[n] = result;
		System.out.printf("Found value fibo %d=%d", n, memoArray[n]);
		System.out.println();
		extracted(memoArray);
		return memoArray[n];

	}

	public static void extracted(int[] memoArray) {
		System.out.print("memarray: ");
		for (int a : memoArray)
			System.out.print(a);
		System.out.println();
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static int maxP(int[] arr) {
		int max = arr[0];
		int pos = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			pos = i;
		}
		return pos;
	}

}
