package com.codechef;

public class SubSet {
	public static void main(String[] args) {


//		 int array[] = { -1, 2, 4, -3, 5, 2, -5, 2 };
		int array[] = { 1, 2, 4 };
		int n = array.length;
		int best = 0;
//		printSubsets(array);
		printBinaryCounter(array);
		//best = print(array, n, best);

	}

	private static int print(int[] array, int n, int best) {
		for (int a = 0; a < n; a++) {
			for (int b = a; b < n; b++) {
				int sum = 0;
				for (int k = a; k <= b; k++) {
					sum += array[k];
					System.out.print(array[k]);
				}
				best = max(best, sum);
				System.out.println();

			}

		}
		return best;
	}

	private static void printBinaryCounter(int[] array) {
		int len=array.length;
		for(int i=0;i<(1<<len);i++)
		{
			
			for(int j=0;j<len;j++)
			{
				if((i&(1<<j))>0)
				{
//					System.out.print(1);
					System.out.print(array[j]);
				}
//				else
//					System.out.print(0);
			}
			System.out.println();
		}
		
	}

	private static int max(int best, int sum) {
		return best > sum ? best : sum;
	}

	static void printSubsets(int set[]) {
		int n = set.length;

		// Run a loop for printing all 2^n
		// subsets one by one
		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");

			// Print current subset
			for (int j = 0; j < n; j++) {
				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				System.out.println("(" + i + "&" + "(1<<(j=" + j + ")=" + (1 << j) + ")="+(i & (1 << j)));
				if ((i & (1 << j)) > 0)
					System.out.print(set[j] + " ");
			}
			System.out.println("}");

		}

	}
}
