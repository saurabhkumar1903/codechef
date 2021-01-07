package com.dsalgo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIS {
	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
//		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int[] l = new int[arr.length];
		List<Integer> list = new ArrayList<>(10);
		list.add(0, 100);
		List<List<Integer>> listOfLIS = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			listOfLIS.add(i, Arrays.asList(1));

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		// zero fill

		Arrays.fill(l, -1);

		findSizeLIS(arr, l, arr.length - 1);
		System.out.println(Fibonacci.max(l));
//		printLIS(arr, l, listOfLIS, arr.length - 1);
		Fibonacci.extracted(l);
		System.out.println(listOfLIS);
		System.out.println(Fibonacci.max(l) + "   " + listOfLIS.get(Fibonacci.maxP(l)));
	}

	private static int printLIS(int[] arr, int[] l, List<List<Integer>> listOfLIS, int i) {
		int max = 0;
		boolean found = false;
		for (int j = 0; j <= i; j++) {
			List<Integer> tempList = new ArrayList<>();
			tempList.add(arr[i]);
			listOfLIS.add(i, tempList);
			if (arr[j] < arr[i]) {
				int ans = 1 + findSizeLIS(arr, l, j);
				int nextInLIS = arr[j];
				if (ans > max) {
					max = ans;
					listOfLIS.get(i).add(nextInLIS);
					found = true;
				}
			}
		}
		if (!found) {
			l[i] = 1;

		} else
			l[i] = max;

		return l[i];
	}

	public static void print(List<Integer> list2) {
		int oldSize = list2.size();
		for (int i = 0; i < oldSize; i++) {
			list2.add(list2.get(i) * list2.get(i));
		}
		System.out.println(list2);

	}

	private static int findSizeLIS(int[] arr, int[] l, int i) {

		int max = 0;
		boolean found = false;
		for (int j = 0; j <= i; j++) {

			if (arr[j] < arr[i]) {
				int ans = 1 + findSizeLIS(arr, l, j);
				if (ans > max) {
					max = ans;
					found = true;
				}
			}
		}
		if (!found)
			l[i] = 1;
		else
			l[i] = max;

		return l[i];
	}

}
