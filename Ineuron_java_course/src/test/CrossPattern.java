package test;

public class CrossPattern {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i==j)||(j==(n+1-i))?'*':' ');
			}
			System.out.println();
		}
	}

}
