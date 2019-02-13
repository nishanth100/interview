# interview

package strings;

public class amazon {

	public static void main(String[] args) {
		
		char [][] arr = {{'a','b','c','d','e'},
						   {'f','g','h','i','j'},
						   {'k','l','m','n','o'},
						   {'p','q','r','s','t'},
						   {'u','v','w','x','y'},
						   {'z'}};
		
		printCharNavigation(arr,"good");
	}

	private static void printCharNavigation(char[][] arr, String target) {
		
		if(target == null || target.isEmpty()) {
			System.out.println("Target is Empty");
		}
		int k =0;
		char[] chArr = target.toCharArray();
		for(int row = 0;row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				if(chArr[k] == arr[row][col]) {
					System.out.println("ENTER");
					if(k<chArr.length-1) {
						k--;
					}else if(k==chArr.length-1) {
						break;
					}
				}else if(chArr[k] > arr[row][col]) {
					System.out.println("LEFT");
				}else {
					System.out.println("RIGHT");
				}
				if(col== arr[row].length -1 && row < arr.length && chArr[k] > arr[row][col]) {
					System.out.println("DOWN");
					row++;
				}
				if(col == arr[row].length -1 && chArr[k] < arr[row][col] && row >=0) {
					System.out.println("TOP");
					row--;
				}
			}
		}
	}
}
