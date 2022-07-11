/*
ACCEPT A NUMBER FROM USER CHECK WHETHER IT IS ARMSTRONG NUMBER OR NOT

IP: 153
OP: true (1^3 + 5^3 + 3^3)= 153 -> 3 is number of digits

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
		
		boolean bRet;
		
		Numbers nobj = new Numbers();
		
		bRet = nobj.ChkArmStrong(iValue);
		
		if(bRet==true)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}

class Numbers
{
	int CountDigit(int iNo)
	{
		int icnt=0;
		
		while(iNo!=0)
		{
			icnt++;
			iNo=iNo/10;
		}
		
		return icnt;
	}
	
	boolean ChkArmStrong(int iNum)
	{
	    int temp=iNum;
		int iDigit=0,Mult=1,power=0,iAns=0;
		
		power=CountDigit(iNum);
		
		while(iNum!=0)
		{
            iDigit=iNum%10;			 
			Mult=1;
			for(int i=0;i<power;i++)
			{
				Mult=Mult*iDigit;
			}

			iAns=iAns+Mult;
			
			iNum=iNum/10;
		}
	
		if(temp==iAns)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
};











