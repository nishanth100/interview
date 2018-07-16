package Arrays;

public class BurstBaloons {

	public static void main(String[] args) {
		
		
		int[] arr = {2,4,3,5};
		System.out.println(findMaxBurstBaloon(arr));
	}

	private static int findMaxBurstBaloon(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return 0;
		}
		int[][] T = new int[arr.length][arr.length];
		for(int len = 1; len<=arr.length; len++) {
			for(int i=0; i<=arr.length -len; i++) {
				int j = i +len -1;
				for(int k=i; k<=j; k++) {
					int leftVal = 1;
					int rightVal = 1;
					
					if(i != 0) {
						leftVal = arr[i-1];
					}
					if(j != arr.length -1) {
						rightVal = arr[j+1];
					}
					
					int before = 0;
					int after = 0;
					if(i != k) {
						before = T[i][k-1];
					}
					if(j != k) {
						after = T[k+1][j];
					}
					
					T[i][j] = Math.max(leftVal*arr[k]*rightVal+before+after, T[i][j]);
				}
			}
		}
		return T[0][arr.length-1];
	}
}
