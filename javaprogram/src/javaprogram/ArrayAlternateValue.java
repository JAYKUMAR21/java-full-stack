package javaprogram;

public class ArrayAlternateValue {
	public static void main(String[] args) {
		
		int arr[] = {20,50,40,85,35,65,95};
		
//		for(int i=0; i<arr.length; i=i+2) {
//			System.out.println(arr[i]);
//		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			i++;
		}
	}
}
