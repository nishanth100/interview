package Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,4,5,7,8,9,10};
		int[] arr2 = {2,6,11,12,13,16,17,19,20};
		
		double res = findMedian(arr1,arr2);
		System.out.println(res);
	}
	private static double findMedian(int[] arr1, int[] arr2) {
		if(arr1.length > arr2.length) {
			return findMedian(arr2, arr1);
		}
		int x = arr1.length;
		int y = arr2.length;
		int low = 0;
		int high = x;
		while(low <=high) {
			int partX = (low+high)/2;
			int partY = (x+y+1)/2 - partX;
			int maxLeftX = (partX ==0) ? Integer.MIN_VALUE : arr1[partX -1];
			int minRightX = (partX == x) ? Integer.MAX_VALUE : arr1[partX];
			int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : arr2[partY -1];
			int minRightY = (partY == y) ? Integer.MAX_VALUE : arr2[partY];
			
			if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if((x+y)%2 ==0) {
					return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
				}else {
					return ((double)Math.max(maxLeftX,minRightY));
				}
			}else if(maxLeftX > minRightY) {
				high = partX -1;
			}else {
				low = partX +1;
			}
		}
		throw new IllegalArgumentException();
	}
}
