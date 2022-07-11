/*
4. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 6 iCol = 6
Output : 
* * * * * *
* # # # * *
* # # * $ *
* # * $ $ *
* * $ $ $ *
* * * * * *
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int arr = sobj.nextInt();
		
		System.out.println("Enter the no of cols");
		int brr = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		
		pobj.DisplayP(arr,brr);
	}
}

class Pattern
{
	void DisplayP(int iRow,int iCol)
	{
		for(int i=iRow;i>=1;i--)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(j==iCol)
				{
					System.out.print("*\t");
				}
				else if(i==1)
				{
					System.out.print("*\t");
				}
				else if(i==iRow)
				{
					System.out.print("*\t");
				}
				else if(j==1)
				{
					System.out.print("*\t");
				}
				else if(i==j)
				{
					System.out.print("*\t");
				}
				else if(i>j)
				{
					System.out.print("#\t");
				}
				else if(i<j)
				{
					System.out.print("$\t");
				}
				
				
			}
			System.out.println();
		}
	}
}
