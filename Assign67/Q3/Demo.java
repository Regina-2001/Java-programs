/*
3. Write a java program which accept two array from user and copy
the contents of that array into another array in reverse order and
return new array.
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

        MyArray aobj = new MyArray();

       int[] brr = aobj.ArrayRev(arr);
       System.out.println("The reverse array is :");
        for(int j=0;j<brr.length;j++)
		{
            System.out.print(brr[j]+"\t");
		}
	}
}

class MyArray
{
       int[] ArrayRev(int crr[])
	   {
		   int[] drr = new int[crr.length];
		   
		   for(int i=crr.length-1,k=0;i>=0;i--,k++)
		   {
			 	drr[k]=crr[i];			
		   }
           return drr;		   
	   }
}
	
		