package com.dsalgo.dp;

import java.util.Arrays;

public class MinimumCoins {

	public static void main(String[] args) {
		int[] coins = { 1, 7, 10 };
		int amount = 15;
		int res = makeChange(amount, coins);
		System.out.println(res);
	}

	private static int makeChange(int amount, int[] coins) {

		if (amount == 0)
			return 0;

		int noOfCoins = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {

			if (amount - coins[i] >= 0) {
				int subCoin = makeChange(amount - coins[i], coins);
				if (subCoin != Integer.MAX_VALUE)
					noOfCoins = Math.min(noOfCoins, subCoin + 1);
			}
		}
		return noOfCoins;

	}

	public static int findMinInArray(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

}
