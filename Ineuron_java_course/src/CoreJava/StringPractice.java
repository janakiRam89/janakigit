package CoreJava;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="janaki";
		String s2=s1.concat("");
		System.out.println(s1==s2);
		s2=""+s1.charAt(2);
		s1=s1+s1.charAt(1);
		s2="";
		System.out.println("A"=="a");
		s2=s2+s1.charAt(1);
		String s3=""+s1.charAt(2);
		
		String[] s4=new String[2];
		final String sf="final";
		sf=sf+"ram";
		
	//	System.out.println(s3[0].concat("hello"));
		
		// StringBuffer
		StringBuffer sb=new StringBuffer(5);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("1234567890123");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("1234567");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		// setCharAt
		StringBuffer sb2=new StringBuffer("janaki");
		sb2.setCharAt(1, 'A');
		System.out.println(sb2);
		System.out.println(sb2.append("ram"));
		System.out.println(sb2);
	}

}
