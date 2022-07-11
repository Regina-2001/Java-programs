/*
3.Write a program which accept number from user and return the count of digits in between 3 and 7.

Input : 2395
Output : 1

Input : 1018
Output : 0

Input : 4521
Output : 2

Input : 9922
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
		
		int iRet=dobj.CountDigits(iValue);
		
		System.out.println("The number of digits in between 3 and 7 are :"+iRet);
	}
}


class Digits
{
	int CountDigits(int iNum)
	{
		int iCnt=0,iDigit=0;
		
		if(iNum<0)
		{
			iNum=-iNum;
		}
		
		while(iNum!=0)
		{
			iDigit=iNum%10;
			
			if((iDigit>3)&&(iDigit<7))
			{
				iCnt++;
			}
			
			iNum=iNum/10;
		}
		return iCnt;
	}
};








