package hard;

public class RainTrappingWater {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(findTrapUnits(arr));
		
	}

	private static int findTrapUnits(int[] heights) {
		int totalUnits = 0;
		if(heights == null || heights.length == 0) {
			return totalUnits;
		}
		
		int[] leftHH = new int[heights.length+1];
		leftHH[0] = 0;
		
		for(int i =0; i<heights.length; i++) {
			leftHH[i+1] = Math.max(heights[i], leftHH[i]);
		}
		
		int rightHH = 0;
		for(int i = heights.length-1; i>=0; i--) {
			rightHH = Math.max(heights[i], rightHH);
			totalUnits += Math.min(leftHH[i], rightHH) > heights[i] ?
					Math.min(leftHH[i], rightHH) - heights[i] : 0;
		}
		return totalUnits;
	}
}