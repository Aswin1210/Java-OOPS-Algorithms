package algo.linearrecursive;

public class App {

	public static void main(String[] args) {
		int [] A ={1,2,3,4,5,6,7,8,9,10};
		RecursiveLinearSearch(A,0,11);

	}
	public static int RecursiveLinearSearch(int [] A,int i, int x) {
			if (A[i]== x) {
				System.out.println("Linear Search: "+i);
				return i;
			}else if(i<A.length-1) {
				System.out.println("Current Position: "+i);
				return RecursiveLinearSearch(A, i+1, x);	
			}
			else return -1;
			
	}
}
