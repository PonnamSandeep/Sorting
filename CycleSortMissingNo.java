package sorting;

public class CycleSortMissingNo {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		
		System.out.println(misssingWithSort(arr));
		

	}
	
	static int misssingWithSort(int [] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i];
			if(arr[i]<arr.length && arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		
		//search for first missing number
		for(int index=1;index<arr.length;index++) {
			if(arr[index]!=index) {
				return index;
			}
		}
		return arr.length;
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}

}
