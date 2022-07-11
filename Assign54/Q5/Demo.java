/*
5.Write a program which accept number from user and return difference between summation of even digits and summation of odd
digits.

Input : 2395
Output : -15 (2 - 17)

Input : 1018
Output : 6 (8 - 2)

Input : 8440
Output : 16 (16 - 0)

Input : 5733
Output : -18 (0 - 18)
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
		
		int iRet = dobj.DiffDigits(iValue);
		
		System.out.println("The difference between summation of even digits and summation of odd digits is :"+iRet);
	}
}


class Digits
{
	int DiffDigits(int iNum)
	{
		int iDigit=0,iSumEven=0,iSumOdd=0;
		
		while(iNum!=0)
		{
			iDigit=iNum%10;
			
			if((iDigit%2)==0)
			{
				iSumEven=iSumEven+iDigit;
			}
			else
			{
			     iSumOdd=iSumOdd+iDigit;
			}
			
			iNum=iNum/10;
		}
		
		return (iSumEven-iSumOdd);
	}
};








