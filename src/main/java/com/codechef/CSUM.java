package com.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class CSUM {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int noOfCases = sc.nextInt();
		int sizeTestArray;
		int noTofind;
		int ka = 0;
		final String[] result = new String[noOfCases];
		for (int i = 0; i < noOfCases; i++) {
			result[ka] = "No";
			sizeTestArray = sc.nextInt();
			noTofind = sc.nextInt();
			final int[] testArray = new int[sizeTestArray];
			for (int j = 0; j < sizeTestArray; j++) {
				testArray[j] = sc.nextInt();
			}
			result[ka] = process(testArray, sizeTestArray, noTofind);
			ka += 1;
		}
		for (int i = 0; i < ka; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}

	private static String process(int[] testArray, int sizeTestArray, int noTofind) {
		Arrays.sort(testArray);
		int i = 0;
		int j = sizeTestArray - 1;
		while (i < j) {
			final int currentSum = testArray[i] + testArray[j];
			if (currentSum == noTofind) {
				return "Yes";
			} else if (currentSum < noTofind) {
				i++;
			} else {
				j--;
			}
		}
		return "No";
	}

}
