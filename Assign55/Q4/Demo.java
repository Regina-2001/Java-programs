/*
4. Write java program which accept N numbers from user and accept Range Display all elements from that range

Input : N : 6
Start: 60
End : 90
Elements : 85 66 3 76 93 88
Output : 66 76 88
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
		
		System.out.println("Enter the range");
		int iNum1 = sobj.nextInt();
		int iNum2 = sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		nobj.DisplayRange(arr,iNum1,iNum2);	
	}
}


class Numbers
{
	void DisplayRange(int str[],int iStart,int iEnd)
	{
		int i=0;
		
		System.out.println("The Elements between the range are:");
	      for(i=0;i<str.length;i++)
		  {
			  if((str[i]>iStart)&&(str[i]<iEnd))
			  {
				 System.out.println(str[i]);
			  }
		  }
	}
};