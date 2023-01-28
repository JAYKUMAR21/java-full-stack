package javaprogram;

public class TraversalOfTwoDArray {
	public static void main(String[] args) {
		
		int [][]arr = {{20,30,50},{10,40}};
		
		for(int elem[] : arr) {
			for(int ar: elem) {
				System.out.print(ar + " ");
			}
			System.out.println();
		}
	}
}


/*
AC no:   2065102000006712
ifsc code:  IBKL0002065
Account holder name: Ramakant singh
Bank account : IDBI bank
*/