package com.dsalgo.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dsalgo.dp.ArraysUtil;

public class PrimeSeive {

	public static void main(String[] args) {
		int n = 10000000;// 10^7
		long startTime = System.currentTimeMillis();
//		List<Integer> naivePrime = naivePrime(n);
		List<Integer> naivePrime = primeSeive(n);
		long endTime = System.currentTimeMillis();
		System.out.println(naivePrime);
		System.out.println("total time taken :" + (endTime - startTime) / 1000);

	}

	private static List<Integer> naivePrime(int n) {
		List<Integer> listOfPrimes = new ArrayList<>();
		for (int i = 3; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(i + "->");
				listOfPrimes.add(i);
			}
		}
		return listOfPrimes;

	}

	private static List<Integer> primeSeive(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int i = 2; i <= n; i++) {

			// This loop is covering multiples , as multiples of a number will never be prime
			for (int j = 2 * i; j <= n; j = j + i) {
				prime[j] = false;
			}
			// This will cover the number itself
			if (prime[i] == true) {
				for (int k = 2; k * k <= i; k++) {
					if (i % k == 0)
						prime[i] = false;
				}
			}

		}
		prime[0] = prime[1] = false;
		prime[2] = true;
//		ArraysUtil.print(prime);
		List<Integer> primes = new ArrayList<>();
		for (int k = 2; k <= n; k++) {
			if (prime[k] == true)
				primes.add(k);
		}
		return primes;
	}
}
