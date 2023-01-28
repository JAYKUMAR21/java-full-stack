
import java.util.Scanner;
public class Matrix {
	
	public static void main(String []args ) {
		//array declaration / creation and initialization
	/*	
		int [][]arr = { {2,3,5},{5,6,8} };
		
		for(int i=0; i<arr.length; i++) {
			for( int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int [2][3];
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the value ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("values are : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
