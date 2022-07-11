/*
4.Write a java program which accept matrix from user and trace and
normal of given matrix.Here trace of the matrix is the sum of the
elements of the main diagonal i.e the diagonal from the upper left to
the lower right of a matrix. Normal of the matrix is the square root of
the sum of all the elements.

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
		
		int iRet = mobj.TraceOfMat(arr,iValue1,iValue2);
		
		System.out.println("The trace of matrix is:"+iRet);
		
	    double d = mobj.NormalOfMat(arr,iValue1,iValue2);
		
		System.out.println("The normal of matrix is:"+d);
	}
}

class Matrix
{
	int TraceOfMat(int brr[][],int iRow,int iCol)
	{
		int isum=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
			   if(i==j)
				{
				  isum=isum+brr[i][j];
			    }
			}
		}
		
		return isum;
	}
	
	double NormalOfMat(int brr[][],int iRow,int iCol)
	{
		double isum=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
			   isum=isum+brr[i][j];
			}
		}
		
		isum=Math.sqrt(isum);
		
		return isum;
	}
}
				