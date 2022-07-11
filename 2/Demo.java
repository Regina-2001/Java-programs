/*
WRITE A PROGRAM WHICH CALCULATE THE EVEN FACTORIAL OF A NUMBER

IP:7
OP:(2*4*6)
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

        Numbers nobj = new Numbers();

        int iRet = nobj.EvenFactorial(iValue);
		
		System.out.println("Even Factorial is"+iRet);
	}
}



class Numbers
{
	int EvenFactorial(int iNum)
	{
		int fact=1;
		int icnt=2;
		
		if(iNum < 0)
		{
			iNum=-iNum;
		}
		
		while(icnt <= iNum)
		{
			fact=fact*icnt;
			icnt=icnt+2;
		}
		return fact;
	}
}



		