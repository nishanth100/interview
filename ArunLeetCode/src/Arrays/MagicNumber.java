package Arrays;

/*
 * Write a function that takes a magic number and a list of numbers.
 * It returns true if it can insert add or subtract operations in the list of numbers to get the magic number.
 * Otherwise, it returns false. 

For example: 

f(10, [1,2]) = false. There's no way to add or subtract 1 and 2 to get 10. 
f(2, [1,2,3,4]) = true. 1 + 2 + 3 - 4 = 2. 
f(0, []) = true 
f(1, []) = false 
f(1, [1]) = true 
f(0, [1]) = false
 */
public class MagicNumber {

	public static void main(String[] args) {
		
		int target = 1;
		int[] arr = {1};
		System.out.println(isMagic(target,arr));
	}

	private static boolean isMagic(int target, int[] arr) {
		
		return checkMagic(target,arr,0,0);
	}

	private static boolean checkMagic(int target, int[] arr, int index, int temp) {
		
		if(arr.length > index) {
			return checkMagic(target, arr, index+1, temp + arr[index]) ||
					checkMagic(target, arr, index+1, temp - arr[index]);
		}	
			if(target == temp)
				return true;
		return false;
	}
}
