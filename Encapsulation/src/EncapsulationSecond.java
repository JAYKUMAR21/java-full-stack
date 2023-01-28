class Student1{
	private String name;
	private int roll;
	private String city;
	private int age;
	/*
	public void setName(String name) {
		 this.name =  name;
	}
	public void setRoll(int roll) {
		this.roll =  roll;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAge(int age) {
		this.age = age;
	}
	*/
	
	//common setter
	public void input(String name, int roll, String city, int age) {
		this.name =  name;
		this.roll =  roll;
		this.city =  city;
		this.age =  age;
	}
	public String getName() {
		return  name;
	}
	public int getRoll() {
		return roll;
	}
	public  String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
}

public class EncapsulationSecond{
	public static void main(String []args) {
		
		Student1 std = new Student1();
//		std.setName("ranjeet");
//		std.setRoll(012);
//		std.setCity("Allaahabad");
//		std.setAge(12);
		
		std.input("ranjeet", 21, "bangalore", 12);
		
		System.out.println(std.getName());
		System.out.println(std.getRoll());
		System.out.println(std.getCity());
		System.out.println(std.getAge());
	}
}