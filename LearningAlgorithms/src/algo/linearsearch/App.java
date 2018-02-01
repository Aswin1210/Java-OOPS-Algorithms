package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println(LinearSearch (a,1));

	}

	public static int LinearSearch(int [] a, int x) {
		for (int i=0; i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}
}

