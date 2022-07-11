/*
ACCEPT A NUMBER AND DISPLAY FIBONACCI SERIES TILL THAT NUMBER.

IP: 40
OP:  0       1       1       2       3       5       8       13      21      34

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
		
		Numbers nobj = new Numbers();
		
	    nobj.DisFibSeries(iValue);
	}
}

class Numbers
{
	void DisFibSeries(int iNum)
	{
		int first=0,sec=1,third=0;
		
		System.out.println("The Fibonacii series is");
		
	    while(first<=iNum)
		{
			System.out.print(first+"\t");
			third=first+sec;
			first=sec;
			sec=third;	
		}
	}
			
			
			
};











