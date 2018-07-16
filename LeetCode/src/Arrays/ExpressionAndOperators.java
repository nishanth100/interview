package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAndOperators {
	/*
	 * Thought process:
	   Divide and conquer. Backtracking. Iterate through all sub-string combinations. Add operators between numbers.
 	   Put path into result list if the calculated result equals target.The characters may be combined to form a multi-digit
 	   number. So I need to iterate through all sub-string combinations. Note that the string "0d" cannot be simplified to 
 	   d (0 can't be dropped). So skip the sub-strings that start with a 0.
 	   
 	   Time complexity:
       For each character, there are four cases of the character that follows: +, -, *, and nothing.
       Say the length of the string is n. The overall time complexity is O(4^n).
	 */
	
	public static void main(String[] args) {
		ExpressionAndOperators am = new ExpressionAndOperators();
		List<String> str = am.addOperators("1234567",50);
		
		for(String s1 : str) {
		  System.out.println(s1 + " = " + " 50 ");
		}
	}
	
	
	 public List<String> addOperators(String num, int target) {
	        List<String> list = new ArrayList<>();
	        addOperators(num, target, 0, 0, "", list);
	        return list;
	    }
	    
	    private void addOperators(String num, long target, int start, long prevItem, String exp, List<String> list) {
	        if (target == 0 && start == num.length()) {
	            list.add(exp);
	            return;
	        }
	        
	        for (int i = start; i < num.length(); i++) {
	            if (i > start && num.charAt(start) == '0') {
	                return;
	            }
	            
	            long n = Long.parseLong(num.substring(start, i + 1));
	            if (start == 0) {
	                addOperators(num, target - n, i + 1, n, exp + n, list);
	            } else {
	                addOperators(num, target - n, i + 1, n, exp + "+" + n, list);
	                addOperators(num, target + n, i + 1, -n, exp + "-" + n, list);
	         //       addOperators(num, target + prevItem - prevItem * n, i + 1, prevItem * n, exp + "*" + n, list);
	            }
	        }
	    }

}
