//importing Scanner class
import java.util.Scanner;

public class Arrays {
	public static void main( String[] args ) {
		
		//creating reference of scanner class 
		Scanner sc = new Scanner(System.in);
		
		//creation of arrays arr with length 5
		int []arr = new int[5];
		
		//loops for storing data inside the array arr
		for (int i = 0; i <5; i++ ) {
			System.out.println("Enter the marks of student" + (i+1) );
			arr[i] = sc.nextInt();
		}
		
		
		//loops for printing the value of arrays
		for(int i = 0; i < 5; i++) {
			System.out.println("marks of student "+ (i+1) +" is: " + arr[i]);
		}
	}
}
