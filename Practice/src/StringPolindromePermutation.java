
public class StringPolindromePermutation {
	
	/*
	 * This algorithm takes O(N) time where N is the length of the String
	 */

	public static void main(String[] args) {
		
		String str = "Rats live on no evil starsz";
		
		System.out.println(isPolindromePermutation(str));
	}

	private static boolean isPolindromePermutation(String str) {
				
	//	int[] table = buildCharFrequencyTable(str);
	//	return checkMaxOneOdd(table);
		return buildCharFrequencyTableApproach2(str);
	}

	private static int[] buildCharFrequencyTable(String str) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		
		for(char c: str.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	
	private static boolean buildCharFrequencyTableApproach2(String str) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		int countOdd = 0;
		for(char c: str.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
			if(table[x] % 2 ==1) {
				countOdd++;
			}else {
				countOdd--;
			}
			}
		}
		return countOdd <=1;
	}

	private static int getCharNumber(char c) {
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

		int val = Character.getNumericValue(c);
		if(a <= val && val <= z) {
			return val -a;
		}
		return -1;
	}

	private static boolean checkMaxOneOdd(int[] table) {
		
		boolean foundOdd = false;
		
		for(int count : table) {
			if(count%2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
}
