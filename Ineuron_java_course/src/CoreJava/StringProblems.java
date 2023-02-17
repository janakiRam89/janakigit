package CoreJava;

public class StringProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// phalindrome
		String s1="nitin";
		String s2="";
		for (int i=s1.length()-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		System.out.println("yes");
		else
			System.out.println("no");
		
		// 
		char[] ch= s1.toCharArray();
		String s3= new String(ch);

	}

}
