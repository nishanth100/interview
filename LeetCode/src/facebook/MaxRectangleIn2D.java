package facebook;

import java.util.Deque;
import java.util.LinkedList;

public class MaxRectangleIn2D {

	public static void main(String[] args) {
		int input[][] = {{1,1,1,0},
                		 {1,1,1,1},
                		 {0,1,1,0},
                		 {0,1,1,1},
                		 {1,0,0,1},
                		 {1,1,1,1}};
		
		System.out.println(findMaxRectangle(input));
	}

	private static int findMaxRectangle(int[][] input) {
		
		if(input == null || input.length == 0) return 0;
		int[] temp = new int[input[0].length];
		int maxArea = 0;
		int area = 0;

		for(int i=0; i<input.length; i++) {
			for(int j=0; j<temp.length; j++) {
				if(input[i][j] == 0) {
					temp[j] = 0;
				}else {
					temp[j] += input[i][j];
				}
			}
			area = maxHistogram(temp);
			if(area > maxArea) {
				maxArea = area;
			}
		}
		return maxArea;
	}

	private static int maxHistogram(int[] temp) {
		if(temp == null || temp.length == 0) return 0;
		Deque<Integer> stack = new LinkedList<>();
		int maxArea = 0;
		int area = 0;
		int i;
		for(i=0; i<temp.length;) {
			
			if(stack.isEmpty() || temp[stack.peekFirst()] <= temp[i]) {
				stack.offerFirst(i++);
			}else {
				int top = stack.pollFirst();
				//If stack is empty means everything till it has to be
				// Greater or equal to input[top] so get area by
				// input[top] * i;
				if(stack.isEmpty()) {
					area = temp[top] * i;
				}
				// If stack is not empty then everything from i-1 to temp.peek() +1
				// has to be greater or equal to temp[top]
				// so area = temp[top]*i(i- stack.peek() -1);
				else {
					area = temp[top] * (i - stack.peekFirst() -1);
				}
				if(area > maxArea) {
					maxArea = area;
				}
			}
		}
		while(!stack.isEmpty()) {
			int top = stack.pollFirst();
			// if stack is empty mean everything till it has to be
			// Greater or equal to temp[top] so get area by
			//input[top] * i
			if(stack.isEmpty()) {
				area = temp[top] * i;
			}
			//If stack is not empty then everything from i-1 to temp.peek() + 1
			// has to be greater or equal to temp[top]
			// so area = temp[top]*(i-stack.peek()-1);
			else {
				area = temp[top] * (i - stack.peekFirst() -1);
			}
			if(area > maxArea) {
				maxArea = area;
			}
		}
		return maxArea;
	}
}
