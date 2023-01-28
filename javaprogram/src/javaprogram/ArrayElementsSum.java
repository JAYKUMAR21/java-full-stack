package javaprogram;

public class ArrayElementsSum {
	public static void main(String[] args) {
		
		int[] ar = {20,50,60,70,80,30};
		
		int sum = 0; 
		for(int elem : ar) {
			sum += elem; 
		}
		System.out.print(sum);
	}
}
