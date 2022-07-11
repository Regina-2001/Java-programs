import java.lang.*;
import java.util.*;


class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int i=0;
		
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		for(i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		Bubble bobj = new Bubble();
	    bobj.Sort(arr);
		
		System.out.println("Array after sorting is");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
	}
}

class Bubble
{
	/*
	public void Sort(int arr[])
	{
		int i=0,j=0,temp=0;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Pass : "+ i+1);
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			System.out.println("Array after pass "+ i+1);
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+"\t");
			}
			System.out.println();
		}
	}
	*/
	public void Sort(int arr[])
	{
		int i=0,j=0,temp=0;
		boolean flag = true;
		
		for(i=0;i<arr.length && flag == true;i++)
		{
			flag = false;
			
			System.out.println("Pass : "+ i+1);
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=true;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			System.out.println("Array after pass "+ i+1);
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+"\t");
			}
			System.out.println();
		}
	}
	
}

