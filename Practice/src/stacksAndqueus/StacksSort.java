package stacksAndqueus;

import java.util.Stack;
public class StacksSort {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.push(9);
		stack.push(16);
		stack.push(4);
		
		sortStack(stack);
		
		for(int i=0; i<4; i++) {
			System.out.print(stack.pop() + ", ");
		}
	}
	public static Stack<Integer> sortStack(Stack<Integer> oldStack) {
		
		Stack<Integer> newStack = new Stack<Integer>();
		
		while(!oldStack.isEmpty()) {
			// Insert all elements from oldstack into new stack in sorted order
			int tmp = oldStack.pop();
			while(!newStack.isEmpty() && newStack.peek() > tmp) {
				oldStack.push(newStack.pop());
			}
			newStack.push(tmp);
		}
		while(!newStack.empty()) {
			oldStack.push(newStack.pop());
		}
		return oldStack;
	}
}
