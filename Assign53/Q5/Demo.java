/*
5. Write Java program which accept N numbers from user and display all such elements which are multiples of 11.

Input : N : 6
Elements : 85 66 3 55 93 88
Output : 66 55 88
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter how many elements");
		int iSize = sobj.nextInt();
		
		int[] arr = new int[iSize];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<iSize;i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		DemoArray nobj = new DemoArray();
		
		nobj.DisplayMultiple(arr);
	}
}


class DemoArray
{
    void DisplayMultiple(int str[])
	{
		int i=0;
		
		System.out.println("The multiples of 11 are :");
		
		for(i=0;i<str.length;i++)
		{
			if((str[i]%11)==0)
			{
				System.out.println(str[i]);
			}
		}
	}
};

	






  