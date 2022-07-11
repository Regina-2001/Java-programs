/*
4. Write a program which accept matrix and check whether the matrix is
identity matrix or not.

Identity matrix is a square matrix with 1’s along the diagonal from upper left to
lower right and 0’s in all other positions.
If it satisfies the structure as explained before then the matrix is called as
identity matrix.

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
		
		boolean bRet = mobj.ChkIdentityMat(arr,iValue1,iValue2);
		
		if(bRet==true)
		{
		        System.out.println("It is a identity matrix");
		}
		else
		{
			  System.out.println("It is not a identity matrix");
		}
	}
}

class Matrix
{
	boolean ChkIdentityMat(int brr[][],int iRow,int iCol)
	{
		int i=0,j=0;
		
		if(iRow!=iCol)
		{
			return false;
		}
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if((i==j)&&(brr[i][j]!=0))
				{
					break;
				}
				if((i<j)&&(brr[i][j]!=1))
				{
					break;
				}
				if((i>j)&&(brr[i][j]!=1))
				{
					break;
				}
			}
		}
		
		if((i==iRow)&&(j==iCol))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
				