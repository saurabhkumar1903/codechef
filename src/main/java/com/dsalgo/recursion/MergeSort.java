package com.dsalgo.recursion;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 1, 2, 4, 0, 0 };

		mergeSort(arr, 0, arr.length - 1);
		ArrayUtils.printArray(arr);
	}

	private static void mergeSort(int[] arr, int start, int end) {

		// base case
		if (start >= end)
			return;
		// recursion to break the array
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
		}
		merge(arr, start, end);

	}

	private static void merge(int[] arr, int start, int end) {
		int[] temp = new int[arr.length + 1];
		int mid = (start + end) / 2;
		int i = start;
		int k = start;
		int j = mid + 1;
		while (i <= mid && j <= end) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= end)
			temp[k++] = arr[j++];

		for (int p = start; p <= end; p++)
			arr[p] = temp[p];
	}

}
