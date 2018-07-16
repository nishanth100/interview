package Arrays;

public class NextPermutation {
	/*Time complexity : O(n)O(n). In worst case, only two scans of the whole array are needed.
	   Space complexity : O(1)O(1). No extra space is used. In place replacements are done.*/
	public static void main(String[] args) {
		int num = 32574;
		String str = String.valueOf(num);
		char[] numArr = str.toCharArray();
		findNextPermutation(numArr);
	}

	private static void findNextPermutation(char[] numArr) {
		if(numArr.length == 0) {
			return;
		}
		// Find the max i, so that K(i-1) < ki
		// Find the max j, so that K(i-1) < kj
		// Swap Ki and K(i-1)
		// reverse from Ki, ki+1.... kn;
	   int i = numArr.length -2;
	   while(i >=0 && numArr[i+1] <= numArr[i]) {
		   i--;
	   }
	   if(i >=0) {
		   int j = numArr.length -1;
		   while(j >=0 && numArr[j] <= numArr[i]) {
			   j--;
		   }
		   swap(numArr, i, j);
	   }
	   reverse(numArr, i+1);
	   
	   for(char c : numArr) {
		   System.out.print(c + ", ");
	   }
	}

	private static void reverse(char[] numArr, int start) {

		int i = start; int j = numArr.length -1;
		while(i <j) {
			swap(numArr,i,j);
			i++;
			j--;
		}
	}

	private static void swap(char[] numArr, int i, int j) {
		char temp = numArr[i];
		numArr[i] = numArr[j];
		numArr[j] = temp;
	}
}
