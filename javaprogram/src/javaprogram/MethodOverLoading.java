package javaprogram;

class Calculator{
	
	//method to add two integer and return sum
	int add ( int num1, int num2 ) {
		return num1 + num2;
	}
	
	//method to add two float and return sum
	float add ( float num1, float num2 ) {
		return num1 + num2;
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int result = c.add(25,28);
		float res = c.add(25.36f, 65.39f);
		
		System.out.println(result);
		System.out.println(res);
	}
}
