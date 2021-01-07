package com.dsalgo.dp;

import java.util.ArrayDeque;
import java.util.Deque;

import lombok.AllArgsConstructor;

public class LISWithIteration {
	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
		int[] l = new int[arr.length];
		int oMax = 0;
		int omI;
		for (int i = 0; i < arr.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && l[j] > max) {
					{
						max = l[j];
					}

				}
			}
			l[i] = 1 + max;
			if (l[i] > oMax) {
				oMax = l[i];
				omI = i;
			}

		}
		System.out.println(oMax);
		ArraysUtil.print(l);
		Deque<Pair> deque = new ArrayDeque<>();

		for (int i = 0; i < l.length; i++) {
			if (l[i] == oMax) {
				deque.add(new Pair(l[i], i, arr[i], arr[i] + ""));
			}
		}

		Pair lastPolledPair = null;
		while (!deque.isEmpty()) {
			lastPolledPair = deque.removeFirst();
			if (lastPolledPair.l == 1)
				System.out.println(lastPolledPair.psf);
			for (int j = lastPolledPair.i - 1; j >=0; j--) {
				if (l[j] == lastPolledPair.l - 1 && arr[j] <= lastPolledPair.v) {
					deque.add(new Pair(l[j], j, arr[j], arr[j] + "->" + lastPolledPair.psf));
				}
			}
		}
//		4eSystem.out.println(lastPolledPair.psf);

	}

	@AllArgsConstructor
	static class Pair {
		private int l;
		private int i;
		private int v;
		private String psf;

	}

}
