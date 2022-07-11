/*
1.Write a program which accept matrix from user and return addition of diagonal
elements.

int AddDiagonal(int Arr[][], int iRow, int iCol)
{
           //Logic
}

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
		
		int iRet = mobj.AddDiagonal(arr,iValue1,iValue2);
		
		System.out.println("The addition of diagonal elements is:"+iRet);
	}
}

class Matrix
{
	int AddDiagonal(int brr[][],int iRow,int iCol)
	{
		int iSum=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if(i==j)
				{
					iSum=iSum+brr[i][j];
				}
			}
		}
		
		return iSum;
	}
}
				