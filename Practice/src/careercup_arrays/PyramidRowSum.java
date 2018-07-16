package careercup_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyramidRowSum {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long rowStartNum = rowStartNum(N, true);
		long prevNumTotal = sumOfN(rowStartNum - 1);
		long nextNumTotal = sumOfN(rowStartNum + (N - 1));
		System.out.println(nextNumTotal - prevNumTotal);
	}
	
	public static long rowStartNum(long N, boolean recursion) {
		if (recursion) {
			if (N == 1) {
				return 1l;
			} else {
				return rowStartNum(N-1, recursion) + N - 1;
			}
		} else {
			long prevFirstElement = 1;
			for (long i = 2; i <= N; i++) {
				prevFirstElement = prevFirstElement + (i - 1);
			}
			return prevFirstElement;
		}
	}
	
	public static long sumOfN(long N) {
		return (N * (N + 1)) / 2l;
	}
}
