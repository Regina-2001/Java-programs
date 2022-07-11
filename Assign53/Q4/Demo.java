/*
4. Write Java program which accept N numbers from user and display all such elements which are divisible by 3 and 5.

Input : N : 6
Elements : 85 66 3 15 93 88
Output : 15
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
		
		DemoArray aobj = new DemoArray();
		
		aobj.DispDivibles(arr);
	}
}


class DemoArray
{
	void DispDivibles(int str[])
	{
		System.out.println("The numbers Divisible by 3 and 5 are:");
		
		for(int i=0;i<str.length;i++)
		{
			if(((str[i]%3)==0) && ((str[i]%5)==0))
            {
				System.out.println(str[i]);
			}
		}
	}
};
