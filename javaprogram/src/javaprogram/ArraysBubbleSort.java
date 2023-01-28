package javaprogram;

public class ArraysBubbleSort {
	public static void main(String[] args) {
		
		int[] ar = {7,5,2,3,1,4,6};
		
		for( int i = 0; i<ar.length; i++) {
//			for(int j=1; j<ar.length; j++) 
			for(int j=1; j<ar.length-i; j++){
				if(ar[j] < ar[j-1]) {
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp; 
				}
			}
		}
		
		for(int elem : ar) {
			System.out.print(elem + " ");
		}
;	} 
}
