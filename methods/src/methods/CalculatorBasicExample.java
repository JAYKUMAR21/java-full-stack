package methods;

public class CalculatorBasicExample {
	
	//method for addition
	public int addtionOfNumbers ( int num1, int num2 ) {
		return num1 + num2;
	}
	
	//method for subtracting two numbers
	public int subtractionOfNumbers ( int num1, int num2 ) {
		if( num1 > num2 )
			return num1 - num2;
		else 
			return num2 - num1;
	}
	
	//method for multiplying two numbers
	public int multiplyTwoNumbers ( int num1, int num2) {
		return num1 * num2;
	}
	
	//method for division of two numbers
	public int divisionOfTwoNumbers ( int num1, int num2 ) {
		if ( num1 > num2 )
			return num1 / num2;
		else 
			return num2 / num1;
	}
	

	public static void main(String[] args) {
		
		CalculatorBasicExample s = new CalculatorBasicExample();
		
		System.out.println( s.addtionOfNumbers(20, 30) );
		System.out.println( s.subtractionOfNumbers(10, 20));
		System.out.println( s.multiplyTwoNumbers(10, 20));
		System.out.println( s.divisionOfTwoNumbers(10, 20));
		
	}

}
