class Employee{
	private String name;
	private String empId;
	private int age;
	private String department;
	/*
	public void setName(String name) {
		this.name =  name;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//common setters
	public void input (String name, String empId, int age, String department) {
		this.name = name;
		this.empId = empId;
		this.age = age;
		this.department = department;
	}
	//constructor 
	Employee(String name, String empId, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
		this.empId = empId;
	}
	//constructor overloading
	Employee(String name){
		this.name = name;
	}
	Employee(String name, String empId){
		this.name = name;
		this.empId = empId;
	}
	Employee(String name, String empId, int age){
		this.name = name;
		this.empId = empId;
		this.age = age;
	}
	Employee(String name, String empId, int age, String department){
		this.name = name;
		this.empId = empId;
		this.age =  age;
		this.department = department;
	} 
	*/
	//constructor chaining 
	Employee(String name){
		this.name=name;
	}
	Employee(String name,String empId){
		this(name);
		this.empId = empId;
	}
	Employee(String name, String empId, int age){
		this(name, empId);
		this.age = age;
	}
	Employee(String name, String empId, int age, String department ){
		this(name, empId, age);
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public String getEmpId() {
		return empId;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
}
public class ConstructorClass {

	public static void main(String[] args) {
//		Employee emp = new Employee(); 
		
		
		Employee emp = new Employee("jay", "0112", 12, "cse"); 
		
//		emp.setName("jay");
//		emp.setEmpId("em0112");
//		emp.setAge(12);
//		emp.setDepartment("CSE");
		
//		emp.input("jay", "em0121", 21, "CSE");
		
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getAge());
		System.out.println(emp.getDepartment());
	}

}
