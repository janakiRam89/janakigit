package CoreJava;

class Calc{
	void add(byte a,byte b)
	{
		System.out.println("byte");
	}
	void add (int a , long b) {
		System.out.println("int");
	}
	void add(long a,float b)
	{
		System.out.println("in long");
	}
	void add(double a, double b) {
		System.out.println("in float");
	}
	
}
public class MethodOverload {
	public static void main(String[] args)
	{
	System.out.println("in main");
	Calc c=new Calc();
	byte b1=2;
	byte b2=3;
	c.add(2,3);
	//main(3);
	}
	public static void main(int a)
	{
		System.out.println("in main method overloaded");
	}

}
