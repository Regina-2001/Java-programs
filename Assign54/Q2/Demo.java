/*
2.Write a program which accept number from user and return the count of odd digits.

Input : 2395
Output : 3

Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Output : 0
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int iValue = sobj.nextInt();
		
		Digits dobj = new Digits();
		
		int iRet = dobj.CountOddDigits(iValue);
		
		System.out.println("The odd number of digits are:"+iRet);
		
	}
}


class Digits
{
	int CountOddDigits(int iNum)
	{
		int iCnt=0;
		int iDigit=0;
		
		while(iNum!=0)
		{
			iDigit=iNum%10;
			
			if((iDigit%2)!=0)
			{
				iCnt++;
			}
			
			iNum=iNum/10;
		}
		return iCnt;
	}
};








