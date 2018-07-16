package vivek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WaveFrontProblem {

	public static void main(String[] args) {
		
		String[] sentenses = {"jim likes mary","kate likes tom","tom does not like jim"};
		String[] queries = {"jim tom","likes"};
		
//		String[] sentenses = {"how it was done","are you how","it goes to it", "goes done are it"};
//		String[] queries = {"done it","it"};
		
		searchQueries(sentenses,queries);
	}

	private static void searchQueries(String[] sentenses, String[] queries) {
		
		if(sentenses.length == 0 || queries.length == 0 || sentenses == null || queries == null) {
			return;
		}
		
		List<List<String>> sentensesWordsListList = new ArrayList<>();
		
		for(String sentense : sentenses) {
			String[] senteseWords = sentense.split(" ");
			List<String> sentenseWordsList = Arrays.asList(senteseWords);
			sentensesWordsListList.add(sentenseWordsList);
		}
		
		for(String query : queries) {
			
			int sentenseIndex = 0;
			boolean matchFound = false;
			
			String[] queryWords = query.split(" ");
			List<String> queryWordsList = Arrays.asList(queryWords);
			
			StringBuffer sbr = new StringBuffer();
			
			for(List<String> senteseWordsList : sentensesWordsListList) {
				
				if(senteseWordsList.containsAll(queryWordsList)) {
					
					int prevWordAppears = 0;
					
					for(String queryWord : queryWordsList) {
						int num = Collections.frequency(senteseWordsList, queryWord);
						
						if(prevWordAppears == 0) {
							prevWordAppears = num;
						}
						
					//	if(prevWordAppears !=num)
					//		break;
					}
					
					for(int i=0; i<prevWordAppears; i++) {
						if(sbr.toString().length() > 0)
						   sbr.append(" ").append(sentenseIndex);
						else
							sbr.append(sentenseIndex);
					}
					matchFound = true;
				}
				sentenseIndex++;
			}
			
			if(!matchFound) {
				System.out.print(-1);
			}else {
				System.out.print(sbr.toString());
			}
			
			System.out.println("");
		}
		
	}
}
