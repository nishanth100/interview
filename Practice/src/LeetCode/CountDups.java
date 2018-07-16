package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDups {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(countDuplicates(arr));
		
	}
	
	  static int countDuplicates(int[] numbers) {
	        // Write your code here.
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int i=0; i<numbers.length; i++){
	            if(map.containsKey(numbers[i])){
	                map.put(numbers[i], map.get(numbers[i]) +1);
	            }else{
	                map.put(numbers[i],1);
	            }
	        }
	       
	        Set<Integer> set = map.keySet();
	        int count =0;
	        for(int j : set){
	            if(map.get(j) > 1){
	                count++;
	            }
	        }
	        return count;


	    }

}
