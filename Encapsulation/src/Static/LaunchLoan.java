package Static;

import java.util.Scanner;
class Loan{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static {
		ri=2.51f;
	}
	
	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.println("kindly Enter the principle ammount");
		pa = sc.nextFloat();
		System.out.println("kindly enter the time duration");
		td = sc.nextFloat();
//		ri = 2.51f;
	}
	
	public void compute() {
		si = (pa*td*ri)/100;
	} 
	public void disp() {
		System.out.println(si);
	}
}
public class LaunchLoan {
	public static void main(String[] args) {
		Loan l1 = new Loan();
		l1.input();
		l1.compute();
		l1.disp();
		
		Loan l2 = new Loan();
		l2.input();
		l2.compute();
		l2.disp();
	}
}
