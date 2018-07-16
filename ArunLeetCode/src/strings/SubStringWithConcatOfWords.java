package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWithConcatOfWords {

	public static void main(String[] args) {
		
		
		String[] words = {"bar", "foo"};
		String str = "barfoohelloNishfoobargreat";
		
		List<Integer> res = findSubStringoFConcat(str,words);
	}

	private static List<Integer> findSubStringoFConcat(String str, String[] words) {

		List<Integer> res = new ArrayList<>();
		if(str == null || str.length() == 0 || words.length == 0) return res;
		
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		
		for(int i=0; i<words.length; i++) {
			if(wordMap.containsKey(words[i])) {
				wordMap.put(words[i], wordMap.get(words[i]) +1);
			}else {
				wordMap.put(words[i], 1);
			}
		}
		
		System.out.println("");
		
		return null;
	}
}

