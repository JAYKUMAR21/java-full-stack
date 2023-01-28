
public class StringCase2 {
	public static void main(String []args) {
		
		String s1 = new String("sachin");
		String s2 = new String("sachin");
		
		System.out.println(s1==s2);//false because of reference comparison
		System.out.println(s1.equals(s2));// true bcs of equals method compare content not reference 
		
		
		StringBuilder sb2 =new StringBuilder("sachin");
		StringBuilder sb1 = new StringBuilder("sachin");
		
		System.out.println(sb1==sb2);//becs reference comparison
		System.out.println(sb1.equals(sb2));//reference comparison
		
		
	}
}
