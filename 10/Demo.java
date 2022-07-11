/*

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		int iValue1 = sobj.nextInt();
		int iValue2 = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		
		pobj.Display(iValue1,iValue2);
	}
}


class Pattern
{
	void Display(int iRow,int iCol)
	{
		char ch = 'A';
		int iNo=1;
		int i=0,j=0;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==j)
				{
					System.out.print("&\t");
				}
				else if((i==1) || (j==1) || (j==iRow) || (i==iRow))
				{
					System.out.print("*\t");
				}
				else if(i>j)
				{
					System.out.print(ch+"\t");
					ch++;
				}
				else 
				{
					System.out.print(iNo+"\t");
					iNo++;
				}
			}
			System.out.println();
		}
	}
};