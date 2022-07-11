/*
ACCEPT A RANGE FROM USER AND DISPLAY ALL STRONG NUMBERS

STRONG NUMBER IS SUCH A NUMBER WHOSE SUMMATION OF FACTORIAL OF DIGITS IS EQUAL TO THE NUMBER

IP: 145 1!+4!+5!=145
OP: True

*/

import java.lang.*;
import java.util.*;

class Demo
{
    public static void main(String arg[])
    {
        boolean bret = false;
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the start");
        int value1 = sobj.nextInt();
		System.out.println("Enter the end");
		int value2 = sobj.nextInt();
        dobj.CheckStrong(value1,value2);
        
    }
}

class Digits
{
    void CheckStrong(int iStart,int iEnd)
    {
       int idigit,ians=0;
	   int i=0,j=0;
	   int fact[]={1,1,2,6,24,120,720,5040,40320,362880};
	   
	   if(iStart>iEnd)
	   {
		   return;
	   }
	   
	   if((iStart<=0)||(iEnd<=0))
	   {
		   return;
	   }
	   
	   for(i=iStart,j=iEnd;i<j;i++,j--)
	   {
		   int iNo=i;
		   ians=0;
		   
	       while(iNo!=0)
	       {
		      idigit=iNo%10;
		       ians=ians+fact[idigit];
		       iNo=iNo/10;
	       }
	       
		   if(ians==i)
	       {
		        System.out.println(i);
	       }
	   }  
	}
};
		
