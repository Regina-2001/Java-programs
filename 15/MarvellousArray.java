package Marvellous;
import java.lang.*;
import java.util.*;


public class MarvellousArray
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