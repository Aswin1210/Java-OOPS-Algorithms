package algo.insertionSort;

public class App {

	public static void main(String[] args) {
		int []A= {5,3,2,6,7,1};
		int []B = InsertionSort(A);
		for (int k=0; k< B.length; k++) {
			System.out.println(B[k]);
		}

	}
	public static int[] InsertionSort(int[] A) {
		for (int i=1;i<A.length;i++) {
			int j=i-1; //last index position of last value in the sorted area
			int element = A[i]; // element variable contains the data we intend on bringing over to the sorted area  
			while(j>=0 && A[j]>element) {
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=element;
			}
		return A;
		}
		
	}


