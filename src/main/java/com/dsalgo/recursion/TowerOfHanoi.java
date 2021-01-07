package com.dsalgo.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 2;
		toh(n, 'a', 'c','b');
	}

	static void toh(int n, char src, char dest, char aux) {
		if (n == 1)
			System.out.println("Move 1 disk from " + src + " to " + dest);
		else {
			toh(n-1, src, aux, dest);
			System.out.println("Move 1 disk from " + src + " to " + dest);
			toh(n - 1, aux, dest, src);
		}
	}

}
