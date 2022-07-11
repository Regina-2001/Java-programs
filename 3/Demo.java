/*
ACCEPT NUMBER FROM USER AND CHECK WHETHER THAT NUMBER IS STRONG NUMBER OR NOT 

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
        System.out.println("Enter number");
        int value = sobj.nextInt();
        bret = dobj.CheckStrong(value);
        if(bret == true)
        {
            System.out.println("Number is Strong");
        }
        else
        {
            System.out.println("Number is not strong");
        }
    }
}

class Digits
{
    boolean CheckStrong(int iNo)
    {
       int temp=iNo,idigit,ians=0,fact=1;
	   
	   while(iNo!=0)
	   {
		  fact=1;
		  idigit=iNo%10;
		  
		  while(idigit!=0)
		  {
			  fact=fact*idigit;
			  idigit--;
		  }
		  
		  ians=ians+fact;
		  
		  if(ians > temp)
		  {
			  break;
		  }
		  
		  iNo=iNo/10;
	   }
	   
	   if(ians==temp)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
	   
	}
};
		
