import java.util.HashMap;
import java.util.Map;

public class TwoSumOfArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,9,4,3,3,-2,8};
		int target = 6;
	//	System.out.println(Arrays.toString(findTwoSum(arr, target)));
	//    findTwoSum(arr, target);
	    
	    System.out.println("NO of Pairs " + numberOfPairs(arr, target));
	}

	/*private static void findTwoSum(int[] arr, int target) {

		HashMap<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
	//	int[] res = new int[2];
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(target - arr[i])) {
		//		res[0] = i;
		//		res[1] = map.get(target- arr[i]);
				System.out.println( i + " + " + map.get(target - arr[i]) + " = " + target );
			}else {
				map.put(arr[i], i);
			}
		}
	//	return res;
	}*/
	
	static int numberOfPairs(int[] a, int k) {
		Map<Integer, Boolean> intFoundMap = new HashMap<>();
		int numofpairs = 0;
		for(int i =0; i < a.length; i++) {
			int value = a[i];
			if(intFoundMap.get(k-value) != null) {
				if(!intFoundMap.get(k-value)) {
						numofpairs++;
						intFoundMap.put(value, true);
						intFoundMap.put(k-value, true);
				}else {
					intFoundMap.put(value, false);
				}
				return numofpairs;
			}
		}
		return numofpairs;
	}
}