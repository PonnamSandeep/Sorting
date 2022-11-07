package sorting;

import java.util.Arrays;

public class CycleSortFirstMissPossitive {

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,6,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static int firstMissPossitive(int [] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]>0&&arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		
		//search for first missing number
		for(int index=0;index<=arr.length;index++) {
			if(arr[index]!=index+1) {
				return index+1;
			}
		}
		return arr.length+1;
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}

}
