package javaprogram;

import java.util.Scanner;
public class TakingInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking input of type integer
//		System.out.print("Enter a integer value");
//		int intValue = sc.nextInt();
//		System.out.println("my integer value is: " + intValue);
		
		
		//taking input of type short
//		System.out.print("Enter a short value");
//		short shortValue = sc.nextShort();
//		System.out.println("my short value is: " + shortValue);
		
		
		//taking input of type double
//		System.out.print("Enter a double value");
//		double doubleValue = sc.nextDouble();
//		System.out.println("my double value is: "+ doubleValue);
		
		//taking input of type character
//		System.out.print("Enter a char value");
//		char charValue = sc.next().charAt(0);
//		System.out.println("my char value is: "+ charValue);
		
		/*
		 * there is no specific method for taking char as a input.
		 * we need to combined next() and charAt() to take single character as a input.
		 * next() takes a whole string(single string) as a input.
		 * charAt() is used to return character present on specific index in a String.
		 */
		
		//taking input of type String
		System.out.print("Enter a String Value ");
		String stringValue =  sc.next();
		System.out.println("my string value is: " + stringValue); 
		sc.nextLine();
		
		//taking input of type String whole line(more than one string)
		System.out.print("Enter a sentence ");
		String sentence = sc.nextLine();
		System.out.println("My sentence is: " + sentence);
	}
}
