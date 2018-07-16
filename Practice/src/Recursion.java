import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Recursion {

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
	        System.out.println(climb(3));
	}

	private static int climb(int n) {
	    if(n < 0)
	        return 0;

	    if(n == 0)
	        return 1;

	    if(!map.containsKey(n)) {
	        int count = climb(n-1) + climb(n-2) + climb(n-3);
	        map.put(n, count);
	    }
	    return map.get(n);
	}
}
