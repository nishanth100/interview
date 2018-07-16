import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class FindDupCharInString {
	public static void main(String[] args) {
		String str = "nishanth";
		findDupCharInString(str);
	}
	private static void findDupCharInString(String str) {
		if(str.length() ==1) {
			System.out.println("NO DUPS " + str);
		}
		
		Map<Character, Integer> map = new HashMap<>();

		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character ch : set) {
			if(map.get(ch) > 1) {
				System.out.println("DUP CHAR in STRING " + ch +" "+map.get(ch));
			}
		}
		
	}
}
