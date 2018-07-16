package hard;
import java.util.Stack;

public class LongestValidParenthesis {

	public static void main(String[] args) {
		
		String str = "(())";
		System.out.println(longestValidParenthesis(str));
	}

	private static int longestValidParenthesis(String str) {
		int maxLen = 0;
		// Create a new stack and push initially -1
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(i); // Push it's index value
			}else {
				stack.pop();
				if(stack.empty()) {
					stack.push(i);
				}else {
					maxLen = Math.max(maxLen, i-stack.peek());
				}
			}
		}
		return maxLen;
	}
}
