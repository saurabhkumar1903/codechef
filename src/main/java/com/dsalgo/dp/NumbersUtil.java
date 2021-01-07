package com.dsalgo.dp;

public class NumbersUtil {

	public static int pow(int n, int multi) {
		int res = 1;
		for (int i = 1; i <= multi; i++)
			res *= n;
		return res;
	}

}
