package javaprogram;

import java.util.Scanner;

public class threeDArray {
	
	public static void main(String []a) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][][] arr = new int [2][2][3];
		
		//taking input from user
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print("Enter the marks of students ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("college " + i + " class " + j + " student " 
													+ k + " marks is: " + arr[i][j][k] );
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
}
