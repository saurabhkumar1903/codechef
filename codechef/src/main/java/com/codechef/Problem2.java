package com.codechef;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		final int noOfCases = sc.nextInt();
		for (int i = 0; i < noOfCases; i++) {
			boolean result = false;
			final int sizeTestArray = sc.nextInt();
			final int[] testArray = new int[sizeTestArray];
			final int noTofind = sc.nextInt();
			for (int j = 0; j < sizeTestArray; j++) {
				testArray[j] = sc.nextInt();
			}
			for (int k = 0; k < sizeTestArray; k++) {
				if (result == Boolean.TRUE) {
					break;
				}
				for (int l = 0; l < sizeTestArray; l++) {

					if (k != l) {
						if (testArray[k] + testArray[l] == noTofind) {
							result = true;
							break;
						}
					}
				}
			}
			System.out.print(result == Boolean.TRUE ? "YES" : "NO");
		}

		sc.close();
	}

}
