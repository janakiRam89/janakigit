package CoreJava;

public class ArrayFunctions {

	public static void main(String [] args)
	{ 	
		int count=0;
	
	int[] arr=new int[]{1,2,3};
	
	for(int i: arr)
	{
		if(i<5){
			break;
			System.out.println("in lloop");
		}
		System.out.println("hello");
	}
	
	}
}
