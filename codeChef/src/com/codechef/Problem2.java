package com.codechef;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfCases = sc.nextInt();
		for (int i = 0; i < noOfCases; i++) {
			boolean result = false;
			int sizeTestArray = sc.nextInt();
			int[] testArray = new int[sizeTestArray];
			int noTofind = sc.nextInt();
			for (int j = 0; j < sizeTestArray; j++) {
				testArray[j] = sc.nextInt();
			}
			for (int k = 0; k < sizeTestArray; k++) {
				if(result==true)
					break;
				for (int l = 0; l < sizeTestArray; l++) {
					
					if (k == l)
						continue;
					else {
						if (testArray[k] + testArray[l] == noTofind) {
							result = true;
							break;
						}
					}
				}
			}
			System.out.print(result==true?"YES":"NO");
		}

		sc.close();
	}

}
