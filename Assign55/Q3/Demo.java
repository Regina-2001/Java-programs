/*
3. Write java program which accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO.

Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : 3

Input : N : 6
NO: 93
Elements : 85 66 3 66 93 88
Output : 4

Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output : -1
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
		
		int iRet=nobj.LastOcc(arr,iNum);

         if(iRet==-1)
		 {
			 System.out.println("Number not found");
		 }
		 else
		 {
            System.out.println("The index of last occurrence is:"+iRet);	
		 }			
	}
}


class Numbers
{
	int LastOcc(int str[],int Key)
	{
		int i=0;
		int iAns=-1;
	      for(i=0;i<str.length;i++)
		  {
			  if(str[i]==Key)
			  {
				 iAns=i;
			  }
		  }
		  return iAns;
	}
};