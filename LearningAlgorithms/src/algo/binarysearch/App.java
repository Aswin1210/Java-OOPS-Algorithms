package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int [] a = {1,2,3,15,16,28,39};
		System.out.println(Binary_Search(a, 16));

	}
	public static int Binary_Search(int [] a, int x) {
		int p=0;
		int r=a.length-1;
		
		
		while (p<= r) {
			int q= (p+r)/2;
			if(a[q] > x) r=q-1;
			else if (a[q] < x) p=q+1;
			else return q; //a[q]==x
		}
		return -1;
	}

}
