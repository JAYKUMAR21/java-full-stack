package javaprogram;

import java.util.Scanner;

public class ArrayBinerySearch {
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int []arr = {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Enter the key value");
		int key = sc.nextInt();
		
		int low = 0; 
		int high = arr.length-1;
		
		while( low <= high ) {
			
			int mid = (low + high)/2;
			
			if( key == arr[mid] ) {
				System.out.println("found " + key + " at the index " + mid );
				break;
			}else if( key < arr[mid] ) {
				high = mid-1;
			}else if( key > arr[mid] ) {
				low = mid + 1; 
			}
		}
		
		if( low > high ) {
			System.out.println("key not found");
		}
	}
}
