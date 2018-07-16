package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		List<List<Integer>> res = findSubSets(arr);
		System.out.println(res);
	}

	private static List<List<Integer>> findSubSets(int[] arr) {
		List<List<Integer>> results = new ArrayList<>();
		
		if(arr == null || arr.length == 0) {
			return results;
		}
		
		Arrays.sort(arr);
		
		List<Integer> subSets = new ArrayList<>();
		
		findFinalSubSets(arr,subSets,results,0);
		
		return results;
	}

	private static void findFinalSubSets(int[] arr, List<Integer> subSets, List<List<Integer>> results, int startIndex) {
		
		results.add(new ArrayList<>(subSets));
		
		for(int i = startIndex; i<arr.length; i++) {
			
			subSets.add(arr[i]);
			findFinalSubSets(arr, subSets, results, i+1);
			subSets.remove(subSets.size()-1);
		}
	}
}
