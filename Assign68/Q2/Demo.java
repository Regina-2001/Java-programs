/*
2. Write java program which accept array from user and replace each
member with summation of its digit.
Input : 89 687 56 549 87 9
Output : 17 21 11 18 15 9
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

        aobj.ArrayNumRev(arr);
	}
}

class MyArray
{
       void ArrayNumRev(int crr[])
	   {
		   int i=0,iNum=0,iSum=0;
          	
           for(i=0;i<crr.length;i++)
		   {
                 iNum=crr[i];
				 iSum=0;
				 while(iNum!=0)
				 {
					 iSum=iSum+(iNum%10);
					 iNum=iNum/10;
				 }
				 
				 crr[i]=iSum;  
		   } 
           System.out.println("The array after summation of digits of elements is :");		   
          for(i=0;i<crr.length;i++)
		  {
             System.out.println(crr[i]+"\t");
		  }
		   
	   }
}
	
		