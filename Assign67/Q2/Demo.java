/*
2. Write a java program which accept two two arrays from user and
display minimum element of each array.
Input : 2 9 7 5 2 3
        9 3 5 5
Output : 2 3
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

       aobj.MinArray(arr,brr);

	}
}

class MyArray
{
       void MinArray(int crr[],int drr[])
	   {
		  int iMin = crr[0];
          
		   for(int i=0;i<crr.length;i++)
		   {
			 if(crr[i]<iMin)
			 {
                iMin=crr[i];
			 }				
		   }

           System.out.println("The minimum element in 1 array is :"+iMin);
		   iMin=drr[0];

		   for(int j=0;j<drr.length;j++)
		   {
			  if(drr[j]<iMin)
			  {
				  iMin=drr[j];
			  }
		   }
		  System.out.println("The minimum element in 2 array is :"+iMin); 
		  
	   }
}
	
		