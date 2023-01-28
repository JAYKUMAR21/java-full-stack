public class Hpattern {
	public static void main(String []args) {
		int n = 15;
		int m = 10;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if( (i==(m-1)/2 && j<=(n-1)/2) || j==0 || j==(n-1)/2 ) {
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
