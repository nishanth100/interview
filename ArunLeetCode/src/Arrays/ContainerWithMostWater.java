package Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5,1,2,3};
		System.out.println(maxAreaOfWaterContainer(arr));
	}

	private static int maxAreaOfWaterContainer(int[] arr) {
		
		int maxArea = 0;
		int l =0;
		int r = arr.length-1;
		while(l<r) {
			int area = Math.min(arr[l],arr[r]) * (r-l);
			maxArea= Math.max(maxArea, area);
			
			if (arr[l]<arr[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		return maxArea;
	}
}
