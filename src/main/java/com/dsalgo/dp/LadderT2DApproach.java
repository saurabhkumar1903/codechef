package com.dsalgo.dp;

import java.util.Arrays;

public class LadderT2DApproach {

	static int n = 4;
	static int memoArray[] = new int[10];

	public static void main(String[] args) {
		int k = 2;

		Arrays.fill(memoArray, -1);

		int noOfWays = ways(n, k);
		System.out.println(ways(4,3));
		System.out.println(ways2(3,2));
		System.out.println(ways2(4,3));
		System.out.println(ways2(5,4));

	}

	private static int ways(int n, int k) {

		if (n < 0)
			return 0;

		if (n == 0)
			return 1;

		int ans = 0;
		for (int i = 1; i <= k; i++)
			ans += ways(n - i, k);
		return ans;

	}

	private static int ways2(int n, int k) {
		Fibonacci.extracted(memoArray);

		if (-1 != memoArray[n])
			return memoArray[n];

		if (n < 0) {
			memoArray[n] = 0;
			return 0;

		}
		if (n == 0) {
			memoArray[n] = 1;
			return 1;
		}

		int ans = 0;
		for (int i = 1; i <= k; i++)
			ans += ways(n - i, k);
		memoArray[n] = ans;
		return ans;

	}

}
