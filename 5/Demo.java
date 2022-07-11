/*
ACCEPT A NUMBER FROM USER AND RETURN ITS GENERIC ROOT

GENERIC ROOT

IP:789
OP:7+8+9->24->2+4->6

*/

import java.lang.*;
import java.util.*;

class Demo
{
    public static void main(String arg[])
    {
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sobj.nextInt();
        int ret = dobj.GenericRoot(value);
        System.out.println("Generic root is : "+ret);
    }
}

class Digits
{
    int GenericRoot(int iNo)
    {
		int ians=0;
		int idigit=0;
      
	    ians=iNo;
		
	   while(ians>9)
	   {
		   iNo=ians;
		   ians=0;
           while(iNo!=0)
		   {
			idigit=iNo%10;
			ians=ians+idigit;
			iNo=iNo/10;
		   }
		  
	   }
		   return ians;
	}
}
