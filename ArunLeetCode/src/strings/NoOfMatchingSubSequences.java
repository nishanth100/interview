package strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NoOfMatchingSubSequences {

	public static void main(String[] args) {
		String s = "abcde";
		String[] words = {"a","b", "bb", "acd", "ace"};
		System.out.println(numMatchingSubseq(s,words));
	}

	private static int numMatchingSubseq(String s, String[] words) {
		Map<Character,Queue<String>> map = new HashMap<>();
		for(char c = 'a'; c <= 'z'; c++) {
			map.put(c,new LinkedList<String>());
		}
		
		for(String word : words) {
			map.get(word.charAt(0)).add(word);
		}
		int count = 0;
		for(char c : s.toCharArray()) {
			Queue<String> que = map.get(c);
			int size = que.size();
			for(int i =0; i<size; i++) {
				String cur = que.poll();
				if(cur.length() == 1) {
					count++;
				}else {
					map.get(cur.charAt(1)).add(cur.substring(1));
				}
			}
		}
		return count;
	}
}
