class Student{
	private String name;
	private int age;
	private int rollNo;
	
	
	void setName(String name) {
		 this.name = name;
	}
	String getName () {
		return name;
	}
	void setAge ( int age ) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	int getRollNo() {
		return rollNo;
	}
}
public class EncapsulatinIntro {
	public static void main(String []args) {
		
		Student st = new Student();
		
//		st.name = "jay";
		
		st.setAge(28);
		st.setName("surbhi");
		st.setRollNo(20);
		System.out.println(st.getAge());
		System.out.println(st.getName());
		System.out.println(st.getRollNo());
	}
}
