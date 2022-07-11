/*
5. Write a program which accept matrix and swap the contents of consecutive rows.
                  ij ij ij ij 
3  2  5  9     ij 11 12 13 14
4  3  2  2     ij 21 22 23 24
8  4  1  9     ij 31 32 33 34
3  9  7  5     ij 41 42 43 44
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int iValue1 = sobj.nextInt();
		
		System.out.println("Enter the no of columns");
		int iValue2 = sobj.nextInt();
		
		int[][] arr = new int[iValue1][iValue2];
		
		System.out.println("Enter the elements");
		for(int i=0;i<iValue1;i++)
		{
			System.out.println("Enter the elements for "+i+" row");
			for(int j=0;j<iValue2;j++)
			{
				arr[i][j] = sobj.nextInt();
			}
		}
		
		System.out.println("Entered elements are:");
		for(int i=0;i<iValue1;i++)
		{
			for(int j=0;j<iValue2;j++)
			{
				System.out.print(arr[i][j]+"\t"); 
			}
			System.out.println();
		}
		
		Matrix mobj = new Matrix();
		
		 mobj.SwapRows(arr,iValue1,iValue2);
	}
}

class Matrix
{
	
	void SwapRows(int brr[][],int iRow,int iCol)
	{
		int i=0,j=0;
	
		System.out.println();
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
			   brr[i+1][j]=brr[i][j]; 
			}
		}
		
		System.out.println("the elements are:");
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(brr[i][j]+"\t"); 
			}
			System.out.println();
		}
	}
}
				