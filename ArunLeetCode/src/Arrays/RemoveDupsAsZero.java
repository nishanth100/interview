package Arrays;

public class RemoveDupsAsZero {

	public static void main(String[] args) {
		
		int[] arr = {4, 6, 3, 33, 3, 1, 3,3,24,4,5,62,1};
		
		findDupsZeroAndSort(arr);
	}

	private static void findDupsZeroAndSort(int[] arr) {

		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j = 1+1; j<len; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if(arr[i] == arr[j] && arr[i] != 0) {
					arr[j] = arr[i];
					arr[i] = 0;
					i =0;
					break;
				}
			}
		}

		for(int k : arr) {
			System.out.print(k +", ");
		}
	}
}
