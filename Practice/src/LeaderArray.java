
public class LeaderArray {

	public static void main(String[] args) {
		
		
		int[] arr = {15,16,3,2,6,1,4};
		
	//	leaderArray(arr);
		leaderArrayOS(arr);
	}

	private static void leaderArrayOS(int[] arr) {
		
		int n = arr.length;
		int mfr = arr[n-1];
		System.out.println("LEADER is " + mfr);
		for(int i = n-2; i>=0 ; i--) {
			if(arr[i] > mfr) {
				System.out.println("Leader is " + arr[i]);
				mfr = arr[i];
			}
		}
	}

	private static void leaderArray(int[] arr) {

		if(arr.length == 0 || arr == null) {
			return;
		}
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j] >= arr[i]) {
					break;
				}
				if(j==n) {
					System.out.println("LEADER " + i);
				}
				
			}
		
		}
	}
}
