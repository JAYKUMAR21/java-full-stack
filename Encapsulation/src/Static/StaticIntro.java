package Static;

class StaticDemo{
	//static variable
	private static int num1;
	private static int num2;
	//static block
	static {
		System.out.println("this is static block");
		num1 = 10;
		num2 = 20;
	}
	//static method
	public static void disp() {
		System.out.println("this is static method");
		System.out.println(num1);
		System.out.println(num2);
	}
	//non-static variable 
	private int num3;
	private int num4;
	//non-static block
	{
		System.out.println("this is non-static block");
		num3 = 30;
		num4 = 40;
	}
	//constructor
	StaticDemo(){
		System.out.println("constructor");
	}
	//non-static method
	public void disp1() {
		System.out.println("this is non-static mehtod");
		System.out.println(num3);
		System.out.println(num4);
	}
}
public class StaticIntro {
	public static void main(String[] args) {
		
		StaticDemo.disp();
		StaticDemo sd = new StaticDemo();
//		StaticDemo.disp();
		sd.disp1();
	}
}
