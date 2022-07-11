/*
5. Write java program which accept N numbers from user and return product of all odd elements.

Input : N : 6
Elements : 15 66 3 70 10 88
Output : 45

Input : N : 6
Elements : 44 66 72 70 10 88
Output : 0
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
			arr[i]=sobj.nextInt();
		}
		
		Numbers nobj = new Numbers();
		
		int iRet=nobj.ProductOfOdd(arr);	
		
		System.out.println("The product of odd elements is :"+iRet);
	}
}


class Numbers
{
	int ProductOfOdd(int str[])
	{
		int i=0;
		int Mult=1;
		
		for(i=0;i<str.length;i++)
		{
			if((str[i]%2)!=0)
			{
				Mult=Mult*str[i];
			}
		}
		
		return Mult;
	}
};