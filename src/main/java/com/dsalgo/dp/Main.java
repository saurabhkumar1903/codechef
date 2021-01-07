package com.dsalgo.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = br.readLine()) != null) {
			long tc = Long.parseLong(input);
			System.out.println(findMaxProfit(tc));
		}

	}

	public static long findMaxProfit(long tc) {

		long ans = 0l;
		if (tc % 12 == 0) {
			ans = findMaxProfit(tc / 2) + findMaxProfit(tc / 3) + findMaxProfit(tc / 4);
		} else
			ans = tc;
		return ans;
	}
}