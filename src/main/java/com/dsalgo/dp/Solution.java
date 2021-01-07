package com.dsalgo.dp;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		int min = minOperation(9050);
		System.out.println(min);
	}

	public static int minOperation(int n) {
		int[] dp = new int[n * 2];
		Arrays.fill(dp, -1);
		int recursion = recursion(n, 0, dp);
		System.out.println("rec:: "+recursion);
		int res = dp[0];
		ArraysUtil.print(dp);
		return res;
	}

	
	public static int recursion(int n, int currentStep,int[] dp) {

		
		if (dp[currentStep] != -1)
		{
		//	System.out.println("cache hit for currentStep: "+currentStep + " value :"+dp[currentStep]);
			return dp[currentStep];
		}

		if (currentStep == n) {
			dp[currentStep] = 0;
			return 0;
		}
		if (currentStep > n) {
			dp[currentStep] = -1;
			return -1;
		}

		int left = recursion(n, currentStep + 1, dp);
		int right;
		if (currentStep == 0)
			right = -1;
		else
			right = recursion(n, currentStep * 2, dp);

		if (left == -1 && right == -1) {
			dp[currentStep] = -1;
			return -1;
		}
		if (left == -1) {
			dp[currentStep] = 1 + right;
			return 1 + right;
		}
		if (right == -1) {
			dp[currentStep] = 1 + left;
			return 1 + left;
		}
		dp[currentStep] = 1 + Math.min(left, right);
	//	System.out.println("For currentStep :" + currentStep);
	//	ArraysUtil.print(dp);
		return dp[currentStep];

	}
	public static int recursion2(int n, int currentStep, int[] dp) {

		if (dp[currentStep] != -1)
		{
			System.out.println("cache hit for currentStep: "+currentStep + " value :"+dp[currentStep]);
			return dp[currentStep];
		}

		if (currentStep == n) {
			dp[currentStep] = 0;
			return 0;
		}
		if (currentStep > n) {
			dp[currentStep] = -1;
			return -1;
		}

		int left = recursion(n, currentStep + 1, dp);
		int right;
		if (currentStep == 0)
			right = -1;
		else
			right = recursion(n, currentStep * 2, dp);

		if (left == -1 && right == -1) {
			dp[currentStep] = -1;
			return -1;
		}
		if (left == -1) {
			dp[currentStep] = 1 + right;
			return 1 + right;
		}
		if (right == -1) {
			dp[currentStep] = 1 + left;
			return 1 + left;
		}
		dp[currentStep] = 1 + Math.min(left, right);
		System.out.println("For currentStep :" + currentStep);
		ArraysUtil.print(dp);
		return dp[currentStep];

	}
}