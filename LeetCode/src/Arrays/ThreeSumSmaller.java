package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSmaller {

	public static void main(String[] args) {
	
		int[] arr = {-2,0,1,3};
		int target = 2;
		System.out.println(threeSumSmaller(arr,target));
	}

	private static int threeSumSmaller(int[] arr,int target) {
		List<List<Integer>> res = new ArrayList<>();
		int n = arr.length, count =0;
		Arrays.sort(arr);
		for(int i=0; i<n-2; i++) {
			int j = i+1, k = n-1;
			while(j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum >= target) {
					k--;
				}else {
					List<Integer> sol = new ArrayList<>();
					sol.add(arr[i]);
					sol.add(arr[j]);
					sol.add(arr[k]);
					res.add(sol);
					count += k-j;
					j++;
				}
			}
		}
		System.out.println(res);
		return count;
	}
}