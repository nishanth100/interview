package facebook;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
	
	public static void main(String[] args) {
		
		String str = "23";
		
		List<String> lists = findCombinations(str);
		System.out.println(lists);
	}

	private static List<String> findCombinations(String str) {
		
		LinkedList<String> result = new LinkedList<>();
		if(str== null || str.length() == 0) {
			return result;
		}
		String[] letters = {"0","1","abc","def","ghi","jkl","mno",
				"pqrs","tuv","wxyz"};
		
		result.add("");
		while(result.peek().length() != str.length()) {
			String remove = result.remove();
			String map = letters[str.charAt(remove.length())-'0'];
			for(char c: map.toCharArray()) {
				result.addLast(remove+c);
			}
		}
		return result;
	}

}
