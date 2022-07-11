/*
2. Write a program which accept matrix and one number from user and return
frequency of that number.

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
		
		System.out.println("Enter the no");
		int iNo = sobj.nextInt();
		
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
		
		int iRet = mobj.Freq(arr,iValue1,iValue2,iNo);
		
		System.out.println("The frequency of "+iNo+" is:"+iRet);
	}
}

class Matrix
{
	int Freq(int brr[][],int iRow,int iCol,int iNum)
	{
		int iCnt=0;
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				if(brr[i][j]==iNum)
				{
					iCnt++;
				}
			}
		}
		
		return iCnt;
	}
}
				