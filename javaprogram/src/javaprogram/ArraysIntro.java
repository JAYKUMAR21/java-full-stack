package javaprogram;

import java.util.Scanner;

public class ArraysIntro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		//int []arr =  new int[5];
		int []arr = new int[size];
		
		
		/*
		//assignment values to the array
		arr[0] = 4;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 8;
		arr[4] = 5;
		
		//printing the value of the array 
		System.out.println("first value of the array / value present on the index 0 : " + arr[0]);
		System.out.println("second value of the array / value present on the index 1 : " + arr[1]);
		System.out.println("third value of the array / value present on the index 2 : " + arr[2]);
		System.out.println("fourth value of the array / value present on the index 3 : " + arr[3]);
		System.out.println("fifth value of the array / value present on the index 4 : " + arr[4]);
		
		*/
		
		//taking input from user for array
		System.out.println("Enter the input :-");
		
//		
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter the first input: ");
			arr[i] = sc.nextInt();
		}
		
		//displaying the data of array
//		for(int i=0; i<5; i++) 
		
		for(int i=0; i<arr.length; i++){
//			System.out.println("value present on index " + i + " is : " + arr[i]);
			System.out.print(arr[i] + " ");
		}
		
	}
}
