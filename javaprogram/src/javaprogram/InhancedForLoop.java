package javaprogram;

import java.util.Scanner;

public class InhancedForLoop {
	public static void main(String[] args) {
		
		/*
		 * we can't use of enhanced for loop for taking input 
		 * we can iterate the array with enhanced for loop
		 */
//		int []arr = {10,20,30,50};
//		
//		for( int elem: arr) {
//			System.out.println(elem);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int elem=0; elem<arr.length; elem++) {
			System.out.println("Enter the data");
			arr[elem] = sc.nextInt();
		}
		
		for(int elem : arr) {
			System.out.println(elem);
		}
	}
}
