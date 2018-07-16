package Arrays;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		
		int[] arr = {3,32,43,58,9};
		
		System.out.println(largestNumber(arr));
	}

	private static String largestNumber(int[] nums) {

		int n = nums.length;
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
			arr[i] = nums[i];
		}
		Arrays.sort(arr,new Comparator<Integer>() {
			public int compare(Integer a,Integer b) {
				String stra =  String.valueOf(a);
				String strb =  String.valueOf(b);
				return (strb + stra).compareTo(stra+strb); 
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(arr[i]==0 && sb.length()==0) {
				continue;
			}
			sb.append(String.valueOf(arr[i]));
		}
		if(sb.length() == 0) {
			return "0";
		}
		
		return sb.toString();
	}
}
