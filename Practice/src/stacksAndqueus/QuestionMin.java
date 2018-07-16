package stacksAndqueus;

public class QuestionMin {
	
	
	public static void main(String[] args) {
		
		StackWithMin2 stack = new StackWithMin2();
		
		int[] arr = {6,5,5,9,2};
		
		for(int value : arr) {
			stack.push(value);
			System.out.print(value + ", ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.println("Popped " + stack.pop());
			System.out.println("New Min is " + stack.min());
		}
	}
}