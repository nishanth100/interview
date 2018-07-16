package stacksAndqueus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashRansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    boolean isValid = true;
    public HashRansomNote(String magazine, String note) {
        magazineMap = new HashMap<String,Integer>();
        noteMap = new HashMap<String,Integer>();
        
        
        for(String word : magazine.split(" ")){
            Integer i = magazineMap.get(word);
            if(i == null){
                magazineMap.put(word, 1);
            }else{
                magazineMap.put(word, i+1);
            }
        }
        
        for(String word : note.split(" ")){
            Integer i = magazineMap.get(word);
            if(i == null || magazineMap.get(word)==0){
            	isValid = false;
            	break;
            }else{
                magazineMap.put(word,i-1);
            }
        }
       
    }
    
    public boolean solve() {
        return isValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        HashRansomNote s = new HashRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

