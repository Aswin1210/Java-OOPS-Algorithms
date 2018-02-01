package algo.quickSort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int [] inputArray = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
		
		quickSort(inputArray,0,inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void quickSort(int [] inputArray,int start,int end) {
		if (start<end) {
			int pp = partition(inputArray,start,end); //index position of the correctly placed pivot value
			quickSort(inputArray,start,pp-1); //sorts left half of the range
			quickSort(inputArray,pp+1,end); //sorts right half of the range
		}
		
	}
	public static int partition(int [] inputArray,int start,int end) {
		
		int pivot = inputArray[end];
		int i = start-1; //initially i starts from -1
	
		for (int j = start; j<= end-1;j++) {
			if (inputArray[j]<= pivot) {
				i++;
				//swapping the values
				int i_value= inputArray[i];
				int j_value = inputArray[j];
				inputArray[i]=j_value;
				inputArray[j]=i_value;
				
			}
		}
		
		//put the pivot value the correct slot and return which slot the pivot value placed next
		int i_value= inputArray[i+1];
		inputArray[end]=i_value;
		inputArray[i+1]=pivot; //here pivot value is placed in the correct slot of the array
		return i+1; //index position of the correctly placed pivot value
	}
}
