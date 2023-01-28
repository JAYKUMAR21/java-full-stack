class Demo1{
	private String name  = "Rajesh";
	private int age = 20;
	
	public void display() {
		System.out.println(name +" "+ age);
	}
}
class Demo2 extends Demo1{
	
}
public class Intro {
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.display();
	}
}
