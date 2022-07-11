/*

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		MarvellousArray aobj = new MarvellousArray(size);
		aobj.Accept();
		aobj.Display();
	}
}

class MarvellousArray
{
	public int arr[];
	
	public MarvellousArray(int iSize)
	{
		arr = new int[iSize];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("The Entered elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}