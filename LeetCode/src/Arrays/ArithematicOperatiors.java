package Arrays;
import java.util.ArrayList;
import java.util.List;
public class ArithematicOperatiors {
	public static void main(String[] args) {
		ArithematicOperatiors am = new ArithematicOperatiors();
		List<String> str = am.addOperators("123456789",100);
		for(String s1 : str) {
		  System.out.println(s1 + " = " + " 100 ");}}
	  private List<String> ans;
	  private char[] num;
	  private char[] exp;
	  private int target;
	  public List<String> addOperators(String num, int target) {
	    this.num = num.toCharArray();
	    this.ans = new ArrayList<>();
	    this.target = target;
	    this.exp = new char[num.length() * 2];
	    dfs(0, 0, 0, 0);
	    return ans;
	  }
	  private void dfs(int pos, int len, long prev, long curr) {
	    if (pos == num.length) {      
	      if (curr == target)
	        ans.add(new String(exp, 0, len));
	      return;
	    }
	    int s = pos;
	    int l = len;
	    if (s != 0) ++len;
	    long n = 0;
	    while (pos < num.length) {
	      if (num[s] == '0' && pos - s > 0) break; // 0X...
	      n = n * 10 + (int)(num[pos] - '0');      
	      if (n > Integer.MAX_VALUE) break; // too long
	      exp[len++] = num[pos++]; // copy exp
	      if (s == 0) {
	        dfs(pos, len, n, n);
	        continue;
	      }
	      exp[l] = '+'; dfs(pos, len, n, curr + n);
	      exp[l] = '-'; dfs(pos, len, -n, curr - n);
	//      exp[l] = '*'; dfs(pos, len, prev * n, curr - prev + prev * n);
	    }
	  }
	}

/*
 * Overall we use recursion (DFS) to solve this problem. 

We need to determine where to put the first operator. Operators can be added randomly among digits. 
For example, output expressions can contain multi-digits number such as 12 + 123* 0. That is why we need for
i in xrange(pos, len(num)): in line 11 to try out all possible positions to insert the first operator.

Then we need to avoid to put invalid numbers in the expression which start with “0”. That is done by line 12 to 13.

The main part is solve function. It records the current position we are looking at (pos),
whether the previous operation is minus (negate) and a product of previous numbers if the previous operation is product(prod). 
The process is to try different operators and numbers, and to evaluate the current expression being tried.

 

If the next operation after the first number (A) is +, for example:

A+B*C = target

A+B+C = target

then we can equivalently try to solve (B C) with target=target-A. But we need to consider A if any operator before 
it is minus or multiple. That’s why we should rather reframe target = target – prod * negate * A.
 

If the next operation after the first number (A) is -, for example,

A – B*C = target

A – B+C = target

then we can equivalently try to solve(-B C) with target=target-A. Here we negate B by letting negate=-1 in the solve function.

 

If the next operation after the first number (A) is *, for example,

A*B*C = target

A*B+C = target

then we need to record the A as the current accumulated product. */
