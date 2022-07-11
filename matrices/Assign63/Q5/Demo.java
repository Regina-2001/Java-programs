/*
5.Write a java program which accept matrix from user and return
addition of border elements of matrix.

*/

import java.lang.*;
import java.util.*;
import java.lang.Math.*;

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
		
		int iRet = mobj.AddBorder(arr,iValue1,iValue2);
		
		System.out.println("The addition of border elements is:"+iRet);
		
	    
	}
}

class Matrix
{
	int AddBorder(int brr[][],int iRow,int iCol)
	{
		int isum=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if((i==0) || (i==iRow-1) || (j==0) || (j==iCol-1))
				{
					isum=isum+brr[i][j];
				}
			}
		}
		
		return isum;
	}
	
}
				