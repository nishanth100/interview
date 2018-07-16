package careercup_arrays;

public class DupElements {

	public static void main(String[] args) {
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

		for(int i=0; i<strArray.length; i++) {
			for(int j= i+1; j<strArray.length;j++) {
				if(strArray[i] == strArray[j] && i!=j) {
					System.out.println("Dup " + strArray[i]);
				}
			}
		}
	}
}
