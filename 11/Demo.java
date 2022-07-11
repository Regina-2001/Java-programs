/*
ACCEPT A STRING FROM USER AND RETURN THE DIFFERENCE OF CAPITAL LETTERS AND SMALL LETTERS

IP: "Hello INdia"

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
		
		int iRet=dobj.StringFreq(arr);
		
		System.out.println("The Difference is:"+iRet);
	}
}

class DemoString
{
	int StringFreq(String str)
	{
		//convert string into character array
	    char arr[]=str.toCharArray();
		
		int i=0,CapCount=0,SmallCount=0;
		
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				CapCount++;
			}
			else if((arr[i]>='a')&&(arr[i]<='z'))
			{
				SmallCount++;
			}
		}
		
		return (CapCount-SmallCount);
	}
};