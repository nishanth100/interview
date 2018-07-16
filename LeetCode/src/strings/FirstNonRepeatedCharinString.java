package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharinString {

	public static void main(String[] args) {
		
		String str = "leetcode";
		System.out.println(firstNonRepeated(str));
	}

	 public static int firstNonRepeated(String s) {
	        if(s == null || s == "" || s.length() == 0){
	            return -1;
	        }
	        if(s.length() == 1) {
	        	return 0;
	        }
	        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	        for(int i=0; i<s.length(); i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }else{
	                map.put(s.charAt(i),1);
	            }
	        }
	        Set<Character> set = map.keySet();
	        char dupCh = 0;
	        for(char ch : set){
	            if(map.get(ch) == 1){
	              dupCh = ch;
	              break;
	            }
	        }
	        
	        for(int i=0; i<s.length(); i++) {
	        	if(s.charAt(i) == dupCh) {
	        		return i;
	        	}
	        }
	        
	        
			return -1;
	        
	    }
}
