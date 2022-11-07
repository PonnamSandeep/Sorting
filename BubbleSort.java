package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubble(int [] arr) {
		
		boolean swapped=false;
		//run the steps n-1 times
		for(int i=0;i<arr.length;i++) {
			// for each step, max item will come at the last respective index
			for(int j=1;j<arr.length-i;j++) {
				// swap if item is smaller than the previous item
				if(arr[j]<arr[j-1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			//if u did not swap for a particular value of i, it means the array is sorted hence stop the programme
			if(!swapped) {
			  break;
			}
		}
	}

}
