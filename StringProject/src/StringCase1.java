//import java.lang.String;
public class StringCase1 {
	public static void main(String []args) {
		
		String s1 = "jay";
		s1.concat(s1);
		
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("jay");
		sb.append("kumar");
		System.out.println(sb);
	}
}
