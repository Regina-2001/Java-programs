/*
5. Write a java program which accept two array from user and check
whether that array and its elements are palindrome or not.
Input : 11 252 387783 252 11
Output : TRUE
Input : 11 252 387783 77 11
Output : FALSE
Input : 11 252 786 252 11
Output : FALSE
Input : 11 252 786 253 11
Output : FALSE
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

        boolean bRet = aobj.ArrayPalindrome(arr);
        if(bRet==true)
		{
			System.out.println("The elements of Array are palindrome");
		}
		else
		{
			System.out.println("The elements of array are not palindrome");
		}
	}
}

class MyArray
{
       boolean ArrayPalindrome(int crr[])
	   {
		   int i=0,k=0,iNum=0,iRev=0;
          	
           for(i=0;i<crr.length;i++)
		   {
                 iNum=crr[i];
				 
				 while(iNum!=0)
				 {
					 iRev=(iRev*10)+(iNum%10);
					 iNum=iNum/10;
				 }
				 
				 if(iNum!=iRev)
				 {
					 break;
				 }
		   }

         	if((i==crr.length))
			{
                  return true;
			}
            else
			{
                  return false;
			}				  
			   
	   }
}
	
		