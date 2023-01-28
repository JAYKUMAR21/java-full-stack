
public class NestedLoop {
	public static void main(String[] args) {
		
		int n = 5;
		
//		for( int i=0; i<5; i++) {
//			for( int j=0; j<5; j++){
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		/*
		 * we can replace digit by variable name as
		 * i have done here by n*/
		
		for( int i=0; i<n; i++) {
			for( int j=0; j<n; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
