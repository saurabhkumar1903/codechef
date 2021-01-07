package com.dsalgo.dp;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class GFG {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int T = in.nextInt(); T-- > 0;) {
			int n = in.nextInt();

			Geeks obj = new Geeks();
			out.println(obj.count(n));
		}
	}
}// } Driver Code Ends

//Complete this function!

class Geeks {
	public long count(int n) {
		int steps[] = { 3, 5, 10 };
		long[] dp = new long[n + 1];
		Map<Integer, ArrayList<String>> solutions = new HashMap<>();
		Arrays.fill(dp, 0);
		dp[0] = 1;

		for (int i = 0; i <= n; i++) {
			List<String> lists = new ArrayList<>();
			solutions.put(i, new ArrayList<>());

		}
		System.out.println(solutions);
		ladder(n, steps, dp, solutions);

		System.out.println(solutions);
		return dp[n];
	}

	public static int ladder(int n, int[] steps, long[] dp, Map<Integer, ArrayList<String>> solutions) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int ans = 0;
		String solution = "";
		for (int i = 0; i < steps.length; i++) {
			solution += steps[i] + "->";
			ans += ladder(n - steps[i], steps, dp, solutions);
		}
		ArrayList<String> list = solutions.get(n);
		list.add(solution);
		solutions.put(n, list);
		dp[n] = ans;
		return ans;
	}
}
