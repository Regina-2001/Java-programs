/*
ACCEPT A NUMBER AND DISPLAY THAT NUMBER OF FIBONACII SERIES.

IP: 10
OP: 0       1       1       2       3       5       8       13      21      34

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
		
		for(int i=0;i<iNum;i++)
		{
			System.out.print(first+"\t");
			third=first+sec;
			first=sec;
			sec=third;
		}
	}
			
			
			
};











