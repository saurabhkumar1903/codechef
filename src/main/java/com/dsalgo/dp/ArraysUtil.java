package com.dsalgo.dp;

public class ArraysUtil {

	public static void print(int[] memoArray) {
		System.out.print("memarray: ");
		for (int a : memoArray)
			System.out.print(a+ " ");
		System.out.println();
	}

	public static void print(boolean[] memoArray) {
		System.out.print("memarray: ");
		for (boolean a : memoArray)
			System.out.print(a+ " ");
		System.out.println();
	}

	public static <T> void print(T[] memoArray) {
		System.out.print("memarray: ");
		for (T a : memoArray)
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
