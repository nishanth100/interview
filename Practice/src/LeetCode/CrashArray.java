package LeetCode;

import java.util.Scanner;

public class CrashArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Size of the array
		int m = sc.nextInt(); // operations in array
		int[] diffArr = new int[n+1]; // [0,0,0,0,0]
		for(int i=0; i<m; i++) {
			int a = sc.nextInt(); // 1
			int b = sc.nextInt(); // 2
			int k = sc.nextInt(); // 100
			diffArr[a] += k;
			if(b+1<= n) {
				diffArr[b+1] -= k;
			}
		}
		long max = 0, addDiff =0; 
		for(int i=1; i<=n; i++) {
			addDiff = addDiff + diffArr[i];
			if(max < addDiff) {
				max = addDiff;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
