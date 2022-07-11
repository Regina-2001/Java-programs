/*
1. Write Java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 4 iCol = 3
Output : * * *
         * * *
         * * *
         * * *
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
		
		Pattern pobj = new Pattern();
		
		pobj.Display(iValue1,iValue2);
	}
}


class Pattern
{
	void Display(int iRow,int iCol)
	{
		if(iRow<0)
		{
			iRow=-iRow;
		}
		
		if(iCol<0)
		{
			iCol=-iCol;
		}
		
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}