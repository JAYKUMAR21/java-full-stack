package javaprogram;

class MehtodsMensuration {
	
	public static void main(String[] args) {
		
		Area ar = new Area();
		
		System.out.println(ar.areaOfTriangle(20.5, 30.5));
		System.out.println(ar.areOfSquare(14.6));
		System.out.println(ar.areaOfRectangle(30.5, 50.8));
		System.out.println(ar.areaOfcircle(47.5));
		System.out.println(ar.areaOfCylinder(15.6, 26.3));
	}
}
class Area{
	public double areaOfTriangle( double height , double base ) {
		double area = (1/2) * height * base;
		return area;
	}
	
	public double areOfSquare ( double side ) {
		double area = side * side;
		return area;
	}
	public double areaOfRectangle ( double length , double width ) {
		return length * width;
	}
	
	public double areaOfcircle( double radius ) {
		return 3.14 * radius * radius;
	}
	
	public double areaOfCylinder( double radius, double height ) {
		double area = 2*3.14*radius*(radius+height);
		return area;
	}
}
