import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,14};
		int target = 18;
		findSum(nums,target);
	}

	private static void findSum(int[] nums, int target) {
		
		/*Map<Integer,Integer> map = new HashMap<>();
		
		int[] res = new int[2];
		
		for(int i=0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				res[0] = i;
				res[1] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i],i);
		}
		System.out.println(Arrays.toString(res));*/
		
		int j = nums.length -1;
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] + nums[j] == target) {
				System.out.println( i + " " + j);
			}else if(nums[i] + nums[j] > target) {
				j--;
			}else if(nums[i] + nums[j] < target) {
				 i++;
			}else {
				System.out.println("TARGET NOT FOUND");
			}
		}
		
	}
}
