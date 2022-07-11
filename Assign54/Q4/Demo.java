/*
4.Write a program which accept number from user and return multiplication of all digits.
Input : 2395
Output : 270

Input : 1018
Output : 8

Input : 9440
Output : 144

Input : 922432
Output : 864
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
	     Scanner sobj = new Scanner(System.in);
	
	     System.out.println("ENter the number");
	     int iValue = sobj.nextInt();
	
	     Digits dobj = new Digits();
	
	     int iRet = dobj.MultDigits(iValue);
	
	     System.out.println("The multiplication of digits is :"+iRet);
	}
}


class Digits
{
	int MultDigits(int iNum)
	{
		int iDigit=0,Mult=1;
		
		while(iNum!=0)
		{
			iDigit=iNum%10;
		    
			if(iDigit==0)
			{
				iDigit=1;
			}
			
			Mult=Mult*iDigit;
			
			iNum=iNum/10;
		}
		
		return Mult;
	}
};








