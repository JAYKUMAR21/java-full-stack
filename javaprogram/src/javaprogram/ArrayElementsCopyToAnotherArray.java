package javaprogram;

public class ArrayElementsCopyToAnotherArray {
	public static void main(String[] args) {
		
		int[] arr= {10,20,50,40};
		int[] arr1 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		for(int elem:arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
		for(int elem:arr1) {
			System.out.print(elem + " ");
		}
	}
}
