package test;

public class TrianglePattern {

	public static void main(String[] args) {
		int n=11;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n||j==1||j==n
						|| (i+j>=(n+3)/2 && i<=(n+1)/2 && j<=(n+1)/2) 
						|| (i-j<=(n-1)/2 && i>=(n+1)/2 && j<=(n+1)/2) 
						|| (j-i<=(n-1)/2 && i <=(n+1)/2 && j>=(n+1)/2) 
						|| (i+j <= (3*n+1)/2 && i>=(n+1)/2 && j>=(n+1)/2))
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++)
//			{
//				if(i==n||j==n|| i+j>=n+1)
//					System.out.print("* ");
//			
//			else
//				System.out.print("  ");
//			}
//			System.out.println();
//		}

	}

}
