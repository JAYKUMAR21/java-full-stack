package javaprogram;

import java.util.Scanner;

public class JaggedArrayTwoD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		
		//taking input from user
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("Enter the marks of students ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("class " + i + " student " + j + " marks is: " + arr[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
