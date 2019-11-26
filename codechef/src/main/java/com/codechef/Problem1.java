package com.codechef;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Problem1

{
	public static void main(String[] args) throws java.lang.Exception {

		final Scanner sc = new Scanner(System.in);
		final float attemptedWithdrawlAmount = sc.nextFloat();
		final float initialBalance = sc.nextFloat();
		final float amountLeftAfterWithdrawl = initialBalance - attemptedWithdrawlAmount - 0.50f;
		if (attemptedWithdrawlAmount % 5 == 0) {
			if (amountLeftAfterWithdrawl < 0) {
				System.out.printf("%.2f", initialBalance);
			} else {
				System.out.printf("%.2f", amountLeftAfterWithdrawl);
			}
		} else {

			System.out.printf("%.2f", initialBalance);
		}
		sc.close();

	}

}
