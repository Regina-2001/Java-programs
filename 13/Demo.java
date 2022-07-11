/*
ACCEPT A STRING FROM USER AND CALCULATE NUMBER OF WORDS.

IP:"Hello_India
OP:2

IP:"--A---B---"
OP:2
*/

import java.lang.*;
import java.util.*;

class Demo 
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String arr = sobj.nextLine();
		
		DemoString dobj = new DemoString();
		
		int iRet=dobj.WordFreq(arr);
		
		System.out.println("Total no of words are :"+iRet);
	}
}

class DemoString
{
	int WordFreq(String str)
	{
		char arr[]=str.toCharArray();
		int iSize=arr.length;
		int i=0,iCnt=0;
		
		while(i<iSize)
		{
			if(arr[i]==' ')
			{
				while((i<iSize) && (arr[i]==' '))
				{
				   i++;
				}
			}
			else if((i<iSize) && (arr[i]!=' '))
			{
				iCnt++;
				while((i<iSize) && (arr[i]!=' '))
				{ 
				   i++;
				}
			}
		}
		return iCnt;
	}
}
		
		