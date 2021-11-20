import java.lang.*;

public class ArrayDemo
{
	public static void main(String args[])
	{
		//1st Approach
			
		int arr1[] = new int [5];
		
		arr1[0] = 11;
		arr1[3] = 18;
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
		//2nd Approcah
		
		int arr2[];
		int size = arr1[3] / 6;
		
		arr2 = new int [size];
			
		arr2[0] = 11;
		arr2[2] = 15;
		
		int ii = 0;
		while(ii<arr2.length)
		{
			System.out.print(arr2[ii] + "\t");
			ii++;
		}
		System.out.println();
		
		//3rd Approach
		
		int arr3[] = new int [] {11,22,33,44};
		
		int j = 0;
		
		do
		{
			System.out.print(arr3[j] + "\t");
			j++;
		}
		while(j<arr3.length);
		System.out.println();	
		
		
		
		//2D - 1st Approach
		
		int arr5[][] = new int [3][3];
		
		arr5[0][0] = 11;
		arr5[1][2] = 18;
		arr5[2][1] = 15;
		
		System.out.println("--------------------------");
		
		for(int r = 0 ; r<3; r++)
		{
			for(int c = 0; c<3; c++)
			{
				System.out.print(arr5[r][c] + "\t");
			}
			System.out.println();
		}
		
		//2D - 2nd Approach
		System.out.println("--------------------------");
		int arr6[][];
		int row = arr1[3]/9;
		int col = arr1[3]/6;
		arr6 = new int [row][col];
		
		arr6[0][0] = 11;
		arr6[1][2] = 18;
		
		for(int r = 0 ; r<row; r++)
		{
			for(int c = 0; c<col; c++)
			{
				System.out.print(arr6[r][c] + "\t");
			}
			System.out.println();
		}
		//2D - 3rd Approach
		System.out.println("--------------------------");
		
		int arr7[][] = new int [][]{{1,2}, {3,4}, {5,6}};
		
		for(int r = 0 ; r<3; r++)
		{
			for(int c = 0; c<2; c++)
			{
				System.out.print(arr7[r][c] + "\t");
			}
			System.out.println();
		}
		
	}
}