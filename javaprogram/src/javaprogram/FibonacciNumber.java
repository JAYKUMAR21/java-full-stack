package javaprogram;

public class FibonacciNumber {
	public static void main(String []args) {
		FibonacciNumber fb = new FibonacciNumber();
		
		int result = fb.fibNumber(2);
		
		System.out.println(result);
	}
	public int fibNumber(int n){
		int firstNum = 0;
		int secondNum = 1;
		int fibnumber=0;
		
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else {
			for(int i=2; i<n; i++) {
				fibnumber = firstNum + secondNum;
				
				firstNum = secondNum; 
				secondNum = fibnumber;
			}
			
		return fibnumber;
		}
		
	}
}
