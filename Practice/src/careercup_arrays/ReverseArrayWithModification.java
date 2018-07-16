package careercup_arrays;

public class ReverseArrayWithModification {

	public static void main(String[] args) {
		
		String[] arr = {"1","2","3","&","12","13","14"};
		String[] res = revrseArray(arr);
		for(String s : res) {
			System.out.print(s + ", ");
		}
	}

	private static String[] revrseArray(String[] arr) {
		int mid = arr.length/2;
		String[] out = new String[arr.length -1];
		
		if(arr[mid] == "&") {
			
			for(int i=0; i<mid; i++) {
				out[i] = arr[arr.length-1-i];
			}
			
			for(int j=mid+1; j<=2*mid; j++) {
				out[j-1] = arr[j-mid-1];
			}
		}
		
		return out;

		
	}
}
