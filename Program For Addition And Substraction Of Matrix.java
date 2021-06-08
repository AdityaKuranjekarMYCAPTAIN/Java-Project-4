
public class MatrixAddMultiply {

	public static void main(String[] args) {
		int a [][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b [][] = {{1,3,4},{2,4,3},{1,2,4}};
		System.out.println("Addition of array : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				int add = a[i][j] + b[i][j];
				System.out.print(add+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Multiplication of array : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				int add = a[i][j] * b[i][j];
				System.out.print(add+" ");
			}
			System.out.println(" ");
		}
	}
//By Aditya Kuranjekar----------->>>>>HAPPY CODING<<<<<<<<<<----------
