
public class PalidromePermutation {

	public static void main(String[] args) {
		
		String str = "Nishu Reddy";
		
		System.out.println(isPermutationOfPalindrome(str));
		System.out.println("SECOND " + isPermutationOfPalindrome2(str));
	}

	private static boolean isPermutationOfPalindrome(String str) {
		
		int[] table = checkCharFrequency(str);
		
		return checkMaxOneOdd(table);
	}
	public static boolean isPermutationOfPalindrome2(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;

				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	private static boolean checkMaxOneOdd(int[] table) {
		
		boolean foundOdd = false;
	
		for(int count : table) {
			if(count %2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
	
		return true;
	}

	private static int[] checkCharFrequency(String str) {
		
		int[] table = new int[26];
		
		for(char c : str.toCharArray()) {
			int x = getCharNumber(c);
			
			if(x != -1) {
				table[x]++;
			}
		}
		
		
		return table;
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
}
