package facebook;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String str = "{{}}(())[[]]";
		
		System.out.println(isValidParenthesis(str));
	}

	private static boolean isValidParenthesis(String str) {
		
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			
		if(ch == '[' || ch == '{' || ch == '(') {
			  stack.push(ch);
		}else if(!stack.isEmpty() && isValidParen(stack.peek(),ch)) {
				stack.pop();
			}else {
				return false;
		}
	}
		return stack.isEmpty();
}

	private static boolean isValidParen(char left, char right) {
		return (left == '(' && right == ')' || left == '{' && right == '}' || left == '[' && right == ']');
	}
}
