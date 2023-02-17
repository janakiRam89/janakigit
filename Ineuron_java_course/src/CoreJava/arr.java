package CoreJava;

class Fan{
	
	int cost;
	String brand;
	int[] arr;
}
public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3};
		int[][] arr2=new int[5][6];
	 int[] arr3=new int[-1];
	
		
		for(int n:arr)
		{
			System.out.println(n);
		}
		
		//System.out.println(arr2);
		Fan f=new Fan();
//		System.out.println(f.arr);
//		System.out.println(arr[1]);
//		int [][] arr3= {{1,2},{3,4}};
//		for(int i=0;i<arr3.length;i++) {
//			for(int y:arr3[i])
//				System.out.println(y);
//		}
//		System.out.println(arr3.length);
		//System.out.println(arr[3]);
		//
		
		//2d array
		int[][] a=new int[][] {{1,2},{3,4}};
		a= arr2;
		System.out.println(a.length);
		
	}

}
