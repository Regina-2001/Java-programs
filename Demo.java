import java.lang.*;
import java.util.*;

class Demo
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
		
        System.out.println("Enter the number of rows");
        int row = sobj.nextInt();
		
        System.out.println("Enter the number of column");
        int col = sobj.nextInt();
		
        int arr[][] = new int[row][col];
		
        System.out.println("Enter the values");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j =0; j< arr[i].length; j++)
            {
                arr[i][j] = sobj.nextInt();    
            }        
        }
		
        System.out.println("Enterred data is : ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j =0; j< arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");    
            }        
            System.out.println();
        }
		
        Matrix mobj = new Matrix();
        mobj.RowSort(arr);
		
        System.out.println("Matrix after complete sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j =0; j< arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");    
            }        
            System.out.println();
        }
        System.out.println();
    }
}  


class Matrix
{
    public void RowSort(int arr[][])
    {
		int i=0,j=0,pass=0,temp=0;
		
        for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
		           for(pass=0;pass<arr[i].length-1-j;pass++)
				   {
					   if(arr[i][pass] > arr[i][pass+1])
					   {
						   temp=arr[i][pass];
						   arr[i][pass]=arr[i][pass+1];
						   arr[i][pass+1]=temp;
					   }
				   }
			}
		}
		
		
    }
}
