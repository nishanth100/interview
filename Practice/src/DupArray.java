
public class DupArray {

	public static void main(String[] args) {
		
		int[] array = {1,1};
		
		int M = 3;
		
		System.out.println(solution(M, array));
		
		
	}
	  public static  int solution(int M, int[] A) {
		  if(A == null || A.length == 0 || A.length <= 1) return 0;
	        int N = A.length;
	        int[] count = new int[M + 1];
	        for (int i = 0; i <= M; i++)
	            count[i] = 0;
	        int maxOccurence = 0;
	        int index = 1;
	        for (int i = 0; i <N; i++) {
	            if (A[i] > 0) {
	                int tmp = count[A[i]];
	                if (tmp > maxOccurence) {
	                    maxOccurence = tmp;
	                    index = i;
	                }
	                count[A[i]] = tmp + 1;
	            } else {
	                count[A[i]] = 1;
	            }
	        }
	        return A[index];
	    }
	}
