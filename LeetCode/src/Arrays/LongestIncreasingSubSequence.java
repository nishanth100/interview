package Arrays;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		
		int[] arr = {10,9,2,5,3,7,101,18};
		
		System.out.println(findLIS(arr));
	}

	private static int findLIS(int[] arr) {

		int[] T = new int[arr.length];
		int[] Solution = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			T[i] = 1;
			Solution[i] = i; 
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					if(T[j] +1 > T[i]) {
						T[i] = T[j] +1;
						
						Solution[i] = j;
					}
				}
			}
		}
		
		int maxindex = 0;
		
		for(int i=0; i<T.length; i++) {
			if(T[i] > T[maxindex]) {
				maxindex = i;
			}
		}
		
		for(int i : Solution) {
			System.out.print(i + ", ");
		}
		
		
		return T[maxindex];
	}
}
