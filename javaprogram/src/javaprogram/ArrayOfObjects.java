package javaprogram;


class Fan{
	 int cost;
	 int noOfWings;
	 String brand;
}

public class ArrayOfObjects {
	
	public static void main(String []args) {
		//creating arrays of type Fan
		Fan[] f = new Fan[3];
		//creating object of fan class on index of Array 0,1,2
		f[0] = new Fan();
		f[1] = new Fan();
		f[2] = new Fan();
		
		f[0].cost = 1000;
		f[0].brand = "jay";
		f[0].noOfWings = 2;
		
		f[1].cost = 2000;
		f[1].brand = "ram";
		f[1].noOfWings = 4;
		
		f[2].cost = 5100;
		f[2].brand = "ramesh";
		f[2].noOfWings = 3;
		
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		
	}
}
