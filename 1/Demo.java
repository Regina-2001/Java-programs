/*
WRITE A PROGRAM TO ACCEPT 2 NUMBERS AND PERFORM ITS ADDITION
*/

import java.lang.*;
import java.util.*;


class Demo
{
	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0,iAns=0;
	    Scanner sobj=new Scanner(System.in);
      
	    System.out.println("Enter the first number");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the second number");
		iValue2=sobj.nextInt();
		
        Arithematic aobj = new Arithematic();

        iAns = aobj.add(iValue1,iValue2);

        System.out.println("Addition is : "+iAns);
	}
}	

class Arithematic
{
	int add(int iNo1,int iNo2)
	{
		int iRet=0;
		iRet=iNo1+iNo2;
		return iRet;
	}
}

