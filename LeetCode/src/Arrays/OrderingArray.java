package Arrays;

public class OrderingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[] {"cc","cb","bb","ac"};
		Character[] ordering = new Character[] {'c','b','a'};
		System.out.println(checkOrder(words,ordering));
	}

	private static boolean checkOrder(String[] words, Character[] ordering) {

		boolean matching = true;
		int order_index = 0;
		
		if(words == null || words.length == 0) {
			return matching = false;
		}
		
		for(int i=0; i<words.length; i++) {
			char firstLetter = words[i].charAt(0);
			if(firstLetter != ordering[order_index]) {
				if(firstLetter == ordering[order_index +1]) {
					order_index += 1;
				}else {
					matching = false;
					break;
				}
			}
		}
		
		return matching;
	}
}