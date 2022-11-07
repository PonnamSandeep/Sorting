package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		arr=mergeSort(arr);
		System.out.println(Arrays.toString(arr));
//		mergeSortInPlace(arr,0,arr.length);
//		System.out.println(Arrays.toString(arr));
	}
	
	static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		
		int mid=arr.length/2;
		
		int[] left =mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}

	 static int[] merge(int[] first,int[] second) {
		
		int[] mix= new int[first.length+second.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<first.length && j<second.length) {
		if(first[i]<second[j]) {
			mix[k]=first[i];
			i++;
		}
		else {
			mix[k]=second[j];
			j++;
		}
		k++;	
	}
		//it may be possible that anyone of the Arr is not compltd
		//copy remaining elements
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<first.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
	}
	 
	 
	 //inplace
	 
	 static void mergeSortInPlace(int[] arr,int s,int e) {
			if(e-s==1) {
				return;
			}
			
			int m=(s+e)/2;
			
			mergeSortInPlace(arr,s,m);
			mergeSortInPlace(arr,m,e);
			
			mergeInPlace(arr,s,m,e);
		}

		 static void mergeInPlace(int[] arr,int s,int m,int e) {
			
			int[] mix= new int[e-s];
			
			int i=s;
			int j=m;
			int k=0;
			
			while(i<m && j<e) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
			}
			else {
				mix[k]=arr[j];
				j++;
			}
			k++;	
		}
			//it may be possible that anyone of the Arr is not compltd
			//copy remaining elements
			while(i<m) {
				mix[k]=arr[i];
				i++;
				k++;
			}
			while(j<e) {
				mix[k]=arr[j];
				j++;
				k++;
			}
			for(int l=0;l<mix.length;l++) {
				arr[s+l]=mix[l];
			}
//			System.arraycopy(arr, 0, arr, s+0, mix.length);
		}
}
