package algo.recursiveBinarySearch;

public class App {

	public static void main(String[] args) {

			int [] a = {1,2,3,15,16,28,39};
			System.out.println(RecursiveBinarySearch(a,0,6,3));

		}
	
		public static int RecursiveBinarySearch(int [] a, int p,int r,int x) {
		
			
			while (p<= r) {
				int q= (p+r)/2;
				if(a[q] == x) return q;
				
				else if(a[q] > x) {
					return RecursiveBinarySearch(a,p,q-1,x);
					
				}else return RecursiveBinarySearch(a,q+1,r,x);
	}
			return -1;
		}
		}



