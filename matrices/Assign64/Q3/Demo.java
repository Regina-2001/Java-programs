/*
3. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :
 H # # # #
H e # # #
H e l # #
H e l l #
H e l l o

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String arr = sobj.nextLine();
		
		Pattern pobj = new Pattern();
		
		pobj.Display(arr);
	}
}

class Pattern
{
	void Display(String arr)
	{
		char str[] = arr.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(i>=j)
				{
					System.out.print(str[j]+"\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
}
