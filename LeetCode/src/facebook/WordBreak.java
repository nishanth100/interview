package facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		
		String str = "applepenapple";
		String s1 = "apple";
		String s2 = "pen";
		
		List<String> worDict = new ArrayList<>();
		worDict.add(s1);
		worDict.add(s2);
		
		System.out.println(wordBreak(str,worDict));
	}

	private static boolean wordBreak(String str, List<String> worDict) {

		Set<String> worDictSet = new HashSet<>(worDict);
		Queue<Integer> queue = new LinkedList<>();
		int[] visited = new int[str.length()];
		
		queue.add(0);
		
		while(!queue.isEmpty()) {
			
			
			int start = queue.remove();
			if(visited[start] == 0) {
				for(int end = start +1; end <= str.length(); end++) {
					if(worDictSet.contains(str.substring(start, end))) {
						queue.add(end);
					}
					
					if(end == str.length()) {
						return true;
					}
				}
			}
			visited[start] = 1;
		}
		
		return false;
	}
}
