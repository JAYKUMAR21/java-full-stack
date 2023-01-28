//importing Scanner class for input 
import java.util.Scanner;

public class DynamicArrays {

	public static void main(String[] args) {
		
		//creating reference for Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		//creating Array of integers
//		int []arr = new int[5];
		int []arr = new int[size];
		
		//for taking input data for Arrays arr
		
		//arr.length is the function to find out length of the given array
		
//		for ( int i = 0; i < 5; i++ )
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter the marks of student "+ (i+1));
			arr[i] = sc.nextInt();
		}
		
		//for output data from array arr
//		for(int i=0; i<5; i++)
		for(int i=0; i<arr.length; i++){
			System.out.println("marks for student " + arr[i]);
		}
	}

}
