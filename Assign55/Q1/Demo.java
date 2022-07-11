/*
1. Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not.

Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : TRUE

Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output:false
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
		
		System.out.println("Enter the number to be searched");
		int iNum = sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		boolean bRet=nobj.ChkNum(arr,iNum);
		
		if(bRet==true)
		{
			System.out.println("The number is present");
		}
		else
		{
			System.out.println("The number is not present");
		}
	}
}


class Numbers
{
	boolean ChkNum(int str[],int Key)
	{
		int i=0;
		
	      for(i=0;i<str.length;i++)
		  {
			  if(str[i]==Key)
			  {
				  break;
			  }
		  }
		  
		  if(i==str.length)
		  {
			  return false;
		  }
		  else
		  {
			  return true;
		  }
	}
};