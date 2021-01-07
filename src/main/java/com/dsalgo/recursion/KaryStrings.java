package com.dsalgo.recursion;

public class KaryStrings {

	public static void main(String[] args) {
		int src[] = { 0, 1 };
		int dest[] = new int[2];
//		kary(dest, 2);
//		karyV2(src, dest, dest.length - 1);

		char[] src1 = { 'a', 'b', 'c' };
		char[] dest1 = new char[3];
		stringPermutation(src1, dest1, 2);
	}

	private static void kary(int[] a, int n) {
		if (n == 0)
			ArrayUtils.printArray(a);
		else {

			a[n - 1] = 0;
			kary(a, n - 1);
			a[n - 1] = 1;
			kary(a, n - 1);

		}

	}

	private static void karyV2(int[] src, int[] dest, int n) {

		for (int i = 0; i < src.length; i++) {
			dest[n] = src[i];
			if (n == 0)
				ArrayUtils.printArray(dest);
			else
				karyV2(src, dest, n - 1);
		}
	}

	private static void stringPermutation(char[] src, char[] dest, int n) {
		for (int i = 0; i < src.length; i++) {
			dest[n] = src[i];
			if (n == 0)
				ArrayUtils.printArray(dest);
			else
				stringPermutation(src, dest, n - 1);
		}
	}
}
