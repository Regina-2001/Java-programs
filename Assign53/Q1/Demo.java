/*
1. Write Java program which accept N numbers from user and return difference between summation of even elements and summation of
odd elements.

Input : N : 6
Elements : 85 66 3 80 93 88
Output : 53 (234 - 181)

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
        int i=0;
		
		Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the no elements");
        int n = sobj.nextInt();
        int[] arr = new int[n];
		
		System.out.println("Enter the elements");
		
        for(i=0;i<n;i++)
		{
             arr[i] = sobj.nextInt();
		}

        DemoArray aobj = new DemoArray();

        System.out.println("The difference is :"+aobj.Diff(arr));

	}
}


class DemoArray
{
	int Diff(int str[])
	{
		int icnt=0;
		int iSumEven=0,iSumOdd=0;
		
		for(icnt=0;icnt<str.length;icnt++)
		{
			if(str[icnt]<0)
			{
				str[icnt] = -str[icnt];
			}
			
			if((str[icnt]%2)==0)
			{
				iSumEven = iSumEven + str[icnt];
			}
			else
			{
				iSumOdd = iSumOdd + str[icnt];
			}
		}
		
		return (iSumEven-iSumOdd);
	}
};

	






  