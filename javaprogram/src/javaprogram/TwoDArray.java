package javaprogram;

import java.util.*;

public class TwoDArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[2][4];
		
		System.out.println("length of array " + arr.length);
		//taking input from user
		for(int i=0; i<arr.length; i++) {
			for( int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of "+i+" class "+ j +" student ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		//printing marks of student 
		for(int i=0; i<arr.length; i++) {
			for( int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of "+i+" class "+ j +"student" + arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
