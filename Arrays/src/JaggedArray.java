import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[2][];
		arr = new int[2][3];
		arr = new int[2][2];
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the Values ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("values are :");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
