public class BPattern {

	public static void main(String[] args) {
		int n = 15;
		int m = 25;
		
		for ( int i=0;  i<n; i++) {
			for (int j=0; j<m; j++) {
				if( (i==0 && j<(m-1)/2) || (i==(n-1)/2 && j<(m-1)/2) || (i==(n-1) && j<(m-1)/2) ||
						(j==0) || (j==(m-1)/2 && i>0 && i<(n-1)/2) || (j==(m-1)/2 && i>(n-1)/2 && i<(n-1)) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
		
		
	}

}
