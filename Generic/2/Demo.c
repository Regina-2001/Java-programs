/*
Maximun of 3 numbers
*/

#include<stdio.h>


float Maximun(float iNo1,float iNo2,float iNo3)
{
	float iMax=0.0;
	
	if((iNo1>=iNo2) && (iNo1>=iNo3))
	{
		iMax=iNo1;
	}
	else if((iNo2>=iNo1) && (iNo2>=iNo3))
	{
		iMax=iNo2;
	}
	else if((iNo3>=iNo1) && (iNo3>=iNo2))
	{
		iMax=iNo3;
	}
	
	return iMax;		
}

int main()
{
	float iValue1,iValue2,iValue3,iRet;
	
	printf("Enter the 1 Number");
	scanf("%f",&iValue1);
	
	printf("Enter the 2 Number");
	scanf("%f",&iValue2);
	
	printf("Enter the 3 Number");
	scanf("%f",&iValue3);
	
	iRet=Maximun(iValue1,iValue2,iValue3);
	
	printf("%f",iRet);
	
	return 0;
}
	