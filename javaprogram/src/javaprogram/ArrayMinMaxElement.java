package javaprogram;

public class ArrayMinMaxElement {
	 public static void main(String[] args) {
		 
		 int []arr = {20,50,30,45,85,35};
		 int maxValue = arr[0];
		 int minValue = arr[0];
		 
		 for(int i=0; i<arr.length; i++) {
			 if(minValue > arr[i])
				 minValue = arr[i];
			 else if( maxValue < arr[i])
				 maxValue = arr[i];
		 }
		 System.out.println(minValue + " " + maxValue);
	 }
}
