package algo.recursion;

public class App {

	public static void main(String[] args) {
		ReducebyOne(10);

	}
	public static void ReducebyOne(int n) {
		if(n>=0) {
		ReducebyOne(n-1);
	}
		System.out.println("Reduced by one completed: "+n);
	}
}
