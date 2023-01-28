package javaprogram;

import java.util.Arrays;

public class ArraysClass {
	 
	public static void main(String[] a) {
		
		//Arrays.fill(arrayName, element) ---> it is used to fill same element in the array
		int[] arr = new int[5];
		Arrays.fill(arr, 5);
		
		for(int elem:arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//Arrays.fill(arrayName, starting index(inclusive), ending index(exclusive), element)
		//for specific index 
		int[] arr1 = { 10, 20, 0, 0, 0, 0, 60, 30 };
		Arrays.fill(arr1, 2, 6, 2);
		
		for(int elem1: arr1 ) {
			System.out.print(elem1 + " ");
		}
		System.out.println();
		
		//Arrays.sort(arrayName) -----> sorting the given Arrays
		
 		Arrays.sort(arr1);//2,2,2,2,10,20,30,60
		for(int elem2: arr1) {
			System.out.print(elem2 + " ");
		}
		System.out.println();
		
		//Arrays.bianrySearch(arrayName, key) ---> searching given  key value in given array
		int res = Arrays.binarySearch(arr1, 30);
		System.out.println(res);
		
		int res1 = Arrays.binarySearch(arr1, 25);
		System.out.println(res1);
	}
}
