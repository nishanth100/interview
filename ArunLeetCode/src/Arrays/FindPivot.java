package Arrays;

public class FindPivot {

	public static void main(String[] args) {
		FindPivot fp = new FindPivot();
		int[] arr = {10,10,10,10,3};
		System.out.println(fp.findPivot(arr));
	}
	 public int findPivot(int[] arr) {
		 int low = 0;
		 int high = arr.length-1;
		 while(low < high) {
			 int mid = (low+high)/2;
			 if(arr[mid] < arr[high]) {
				 high = mid;
			 }else if(arr[mid] > arr[high]) {
				 low = mid +1;
			 }else {
				 high--;
			 }
		 }
		 return arr[low];
	 }
}
