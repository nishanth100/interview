package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> result = groupAnagramsTogether(str);
		System.out.println(result);
	}

	private static List<List<String>> groupAnagramsTogether(String[] strs) {

		if(strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		
		Map<String,List> map = new HashMap<>();
		
		for(String s : strs) {
			
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		
		
		return new ArrayList(map.values());
	}
}
