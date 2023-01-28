
public class Main {
	
	public static void main(String[] args) {
		char[] ch = {'j','a','v','a'};
		//creating arrays of type char
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		String s2 = new String("java");
		String s3 = s1.intern();
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
