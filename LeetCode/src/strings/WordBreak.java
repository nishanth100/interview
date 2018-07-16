package strings;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		
		String str = "leetkcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leetk");
		wordDict.add("code");
		System.out.println(wordBreak(str,wordDict));
	}

	private static boolean wordBreak(String str, List<String> wordDict) {

		boolean[] isWordBreak = new boolean[str.length()+1];
		isWordBreak[0] = true;
		for(int i=0; i< str.length()+1; i++) {
			for(int j=0; j<i; j++) {
				if(!isWordBreak[j]) {
					continue;
				}
				if(wordDict.contains(str.substring(j, i))) {
					isWordBreak[i] = true;
					break;
				}
			}
		}
		return isWordBreak[str.length()];
	}
}
