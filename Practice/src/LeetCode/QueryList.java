package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QueryList {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String,Integer>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
    
        int Q = sc.nextInt();
        
        for(int i=0; i<Q; i++){
            String str = sc.next();
            System.out.println(map.get(str));
        }
        
    
    }
}