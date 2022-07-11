/*
Maximun of 3 numbers
*/

#include<stdio.h>
#include<iostream>
using namespace.std;


template <class T>

T Maximun(T iNo1,T iNo2,T iNo3)
{
	T iMax=0.0;
	
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
	float fValue1,fValue2,fValue3,fRet;
	
	printf("Enter the 1 Number");
	scanf("%f",&fValue1);
	
	printf("Enter the 2 Number");
	scanf("%f",&fValue2);
	
	printf("Enter the 3 Number");
	scanf("%f",&fValue3);
	fRet=Maximun(fValue1,fValue2,fValue3);
	printf("%f",fRet);
	
	
	
	int iValue1,iValue2,iValue3,iRet;
	
	printf("Enter the 1 Number");
	scanf("%d",&iValue1);
	
	printf("Enter the 2 Number");
	scanf("%d",&iValue2);
	
	printf("Enter the 3 Number");
	scanf("%d",&iValue3);
	
	iRet=Maximun(iValue1,iValue2,iValue3);
	
	printf("%d",iRet);
	
	char cValue1,cValue2,cValue3,cRet;
	printf("Enter the 1 Number");
	scanf("%c",&cValue1);
	
	printf("Enter the 2 Number");
	scanf("%c",&cValue2);
	
	printf("Enter the 3 Number");
	scanf("%c",&cValue3);
	
	cRet=Maximun(cValue1,cValue2,cValue3);
	
	printf("%c",cRet);
	
	
	return 0;
}
	