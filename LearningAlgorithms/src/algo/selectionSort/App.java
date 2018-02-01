package algo.selectionSort;

public class App {

	public static void main(String[] args) {
		int []a = Selection_Sort(new int []{3,5,111111111,4,1,28,1231,3242,9});
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}
	public static int [] Selection_Sort(int [] A) {
		for (int i=0;i<A.length;i++) {
		int minimum = i;
			for (int j=i+1; j<A.length; j++) {
				if (A[j]< A[minimum]) {
					minimum = j;
				}
				int temp = A[i];
				A[i] = A[minimum];
				A[minimum]=temp;
		}
	}
		return A;
}
}
