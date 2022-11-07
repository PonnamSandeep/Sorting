package sorting;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int array[] = {2,3,4,1,6,7};
		System.out.println(MissingNumber(array,n));
		
	}
	
	 static int MissingNumber(int array[], int n) {
	        Arrays.sort(array);
	        for(int i=0; i<array.length;i++){
	            if(array[i]!=i+1){
	              return i+1;
	            }
	        }
	        return array.length;
	    }
	 
}
