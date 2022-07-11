/*
5. /Write a program which accept matrix and check whether the matrix is
Sparse matrix or not.
Sparse matrix is a matrix with the majority of its elements equal to zero.

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
		
		boolean bRet = mobj.ChkSparseMat(arr,iValue1,iValue2);
		
		if(bRet==true)
		{
		        System.out.println("It is a Sparse matrix");
		}
		else
		{
			  System.out.println("It is not a Sparse matrix");
		}
	}
}

class Matrix
{
	boolean ChkSparseMat(int brr[][],int iRow,int iCol)
	{
		int i=0,j=0;
		int iCnt=0;
		int iNo=0;
		
		iNo=iRow*iCol;
		
		if(iRow!=iCol)
		{
			return false;
		}
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(brr[i][j]==0)
				{
					iCnt++;
				}
			}
		}
		
		
		if((i==iRow)&&(j==iCol)&&(iCnt>(iNo/2)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
				