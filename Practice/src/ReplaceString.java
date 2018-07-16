
public class ReplaceString {

	
	public static void main(String[] args) {
		
		
		String str = "I will get ft  soon  ";
		
		char[] arr = str.toCharArray();
		
		int trueLength = arr.length;
		
		replaceSpace(arr,trueLength);
		System.out.println(new String(arr));
	}

	private static void replaceSpace(char[] arr, int trueLength) {
		
		int spaceCount = 0, index, i =0;
		
		for(i=0; i < trueLength; i++) {
			if(arr[i] == ' ') {
				spaceCount++;
			}
		}
				
		index = trueLength + spaceCount * 2;
		char[] charSet = new char[index];
		
		for(i = trueLength -1 ; i >= 0 ; i--) {
			if(arr[i] == ' ') {
				charSet[index-1] = '0';
				charSet[index-2] = '2';
				charSet[index-3] = '%';
				index = index - 3;
			}else {
				charSet[index-1]= arr[i];
				index--;
			}
		}
				
		System.out.println(new String(charSet));
	}
}
