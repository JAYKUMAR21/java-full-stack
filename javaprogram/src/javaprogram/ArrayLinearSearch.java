package javaprogram;

import java.util.Scanner;

public class ArrayLinearSearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		ArrayLinearSearch ar = new ArrayLinearSearch();
		
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		System.out.println("Enter the key value");
		int key = sc.nextInt();
		
		int []arr = new int[size];
		
		for( int i=0; i<arr.length; i++) {
			System.out.println("Enter the value: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("index of that value is: " + linearSearch(arr, key));
		
		
	}
	
	public static int linearSearch( int[] arr, int keyValue ) {
		
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			if( arr[i] == keyValue ) {
				result += i;
				break;
			}
			
		}
		
		return result;
	}
}
