package com.dsalgo.dp;

/*
 * 
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 
 * … shows the first 11 ugly numbers. By convention, 1 is included.
 * Given a number n, the task is to find n’th Ugly number.
 */
public class UglyNumber {

	public static void main(String[] args) {

		int n = 150;
		int uglyNum = findUglyNum(n);
		System.out.println(uglyNum);
	}

	private static int findUglyNum(int n) {
		int uglyArr[] = new int[n + 2];
		uglyArr[1] = 1;
		int uglyCount = 1;
		for (int i = 2; uglyCount <= n; i++) {
			System.out.println("checking for i : " + i + " ugly count now " + uglyCount);
			if (checkIfUgly(i)) {
				uglyCount += 1;
				uglyArr[uglyCount] = i;
			}
		}
		return uglyArr[n];
	}

	private static boolean checkIfUgly(int i) {

		i = findNumberAfterDivisionWithMaxMultiple(i, 2);
		if (i == 1)
			return true;
		i = findNumberAfterDivisionWithMaxMultiple(i, 3);
		if (i == 1)
			return true;
		i = findNumberAfterDivisionWithMaxMultiple(i, 5);
		if (i == 1)
			return true;

		return false;
	}

	private static int findNumberAfterDivisionWithMaxMultiple(int n, int toCheck) {

		if (n % toCheck == 0)
			return findNumberAfterDivisionWithMaxMultiple(n / toCheck, toCheck);
		return n;

	}

}
