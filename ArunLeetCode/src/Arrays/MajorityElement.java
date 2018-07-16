package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		
		
		int[] arr = {0,0,0};
		MajorityElement mj = new MajorityElement();
		System.out.println(mj.majorityElement(arr));
	}
	
	 public List<Integer> majorityElement(int[] nums) {
	        List<Integer> res = new ArrayList<Integer>();
	        if(nums == null || nums.length == 0){
	            return res;
	        }
	        
	        Map<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0; i<nums.length; i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i],map.get(nums[i])+1);
	            }else{
	                map.put(nums[i],1);
	            }
	        }
	        Set<Integer> set = map.keySet();
	        for(int key : set){
	            if(map.get(key) > nums.length/3){
	                res.add(key);
	            }
	        }
	        
	        return res;
	    }
}
