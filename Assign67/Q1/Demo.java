/*
1. Write a java program which accept two arrays from user and return
difference between summation of arrays.
Input : 2 9 7 5 2 3
        9 3 5 5
Output : 6
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter how many elements 1 array");
		int iSize1 = sobj.nextInt();
		int[] arr = new int[iSize1];
        System.out.println("Enter the elements of 1 array:");
		for(int i=0;i<iSize1;i++)
		{
              arr[i] = sobj.nextInt();
		}

        System.out.println("Enter how elements you want in 2 array");
        int iSize2 = sobj.nextInt();
        int[] brr = new int[iSize2];
        System.out.println("Enter the elements 2 array:");
        for(int j=0;j<iSize2;j++)
		{
             brr[j] = sobj.nextInt();
		}
        
        MyArray aobj = new MyArray();

        int iRet = aobj.DiffOfArray(arr,brr);
		
		System.out.println("The difference between the summation of the 2 arrays is :"+iRet);
	}
}

class MyArray
{
       int DiffOfArray(int crr[],int drr[])
	   {
		  int iAns1 = 0,iAns2 = 0;              
		   for(int i=0;i<crr.length;i++)
		   {
			   iAns1=iAns1+crr[i];
		   }

		   for(int j=0;j<drr.length;j++)
		   {
			   iAns2=iAns2+drr[j];
		   }
		   
		   return(iAns1-iAns2);
	   }
}
	
		