import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	
	public static void main(String[] args) {
		
		int [] res = oddNumbers(3,9);
		for(int i: res)
			System.out.println(i);
	}


    static int[] oddNumbers(int l, int r) {
        if(l < 0 || r < 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(i%2 == 1){
                list.add(i);
            }
        }
        
        int[] res = new int[list.size()];
             for (int i = 0; i < list.size(); i++) {
        res[i] = list.get(i);
    }
        return res;

    }
}
