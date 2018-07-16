package Arrays;

public class MinJumpNeededToEndOfArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,8,6,4,3,2,1,9};
		
		System.out.println(minJump(arr));
	}

	private static int minJump(int[] arr) {

		int[] jumpArr = new int[arr.length];
		jumpArr[0] = 0;
		
		for(int i=1; i<arr.length; i++) {
			jumpArr[i] = Integer.MAX_VALUE;
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j =0; j<i; j++) {
				if(i <= j +arr[j]){
					jumpArr[i] = Math.min(jumpArr[i],jumpArr[j]+1);
					}
				}
			}
		return jumpArr[jumpArr.length-1];
	}
}
