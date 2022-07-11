/*
3. Write Java program which accept N numbers from user and display all such elements which are even and divisible by 5.

Input : N : 6
Elements : 85 66 3 80 93 88
Output : 80
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		int i=0;
		
        Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter how many elements");
		int n = sobj.nextInt();
		
		int[] arr = new int[n];
		
        System.out.println("Enter the numbers");		

		for(i=0;i<n;i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		DemoArray aobj = new DemoArray();
		
		aobj.DisplayMul(arr);
	}
}


class DemoArray
{
    void DisplayMul(int str[])
	{
	    int i=0;

        System.out.println("The numbers which are even and divisible by 5 are:");
		
		for(i=0;i<str.length;i++)
        {
			if(((str[i]%5)==0) && ((str[i]%2)==0))
			{
				System.out.println(str[i]);
			}
		}
	}
};

	






  