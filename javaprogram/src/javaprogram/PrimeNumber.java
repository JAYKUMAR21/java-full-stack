package javaprogram;    

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		
		int isPrime = pn.primeNumber(1);
		
		if( isPrime == 0 ) {
			System.out.println("Number is a prime number");
		}else if(isPrime == 1 ){
			System.out.println("Number is not a prime number");
		}
		
	}
	public int primeNumber( int num ) {
		int result = 0;
		if( num==0 || num==1 ) {
			result = 1;
		}
		else {
			for(int i=2; i<num/2; i++) {
				if( num%i == 0 )
					result = 1;
			}
		}
		return result;
	}
}
