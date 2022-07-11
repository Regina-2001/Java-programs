/*
5. Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output :
 1 2 3 4 5
1 2 5
1 3 5
1 4 5
1 2 3 4 5
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
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(j==iCol)
				{
					System.out.print(j+"\t");
				}
				else if(i==1)
				{
					System.out.print(j+"\t");
				}
				else if(i==iRow)
				{
					System.out.print(j+"\t");
				}
				else if(j==1)
				{
					System.out.print(j+"\t");
				}
				else if(i==j)
				{
					System.out.print(j+"\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
