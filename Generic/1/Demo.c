/*Maximun of 3 numbers
*/

#include<stdio.h>


int Maximun(int iNo1,int iNo2,int iNo3)
{
	int iMax=iNo1;
	
	if(iMax<iNo1)
	{
		iMax=iNo1;
	}
	else if(iNo2>iMax)
	{
		iMax=iNo2;
	}
	else if(iNo3>iMax)
	{
		iMax=iNo3;
	}
	
	return iMax;		
}

int main()
{
	int iValue1,iValue2,iValue3,iRet;
	
	printf("Enter the 1 Number");
	scanf("%d",&iValue1);
	
	printf("Enter the 2 Number");
	scanf("%d",&iValue2);
	
	printf("Enter the 3 Number");
	scanf("%d",&iValue3);
	
	iRet=Maximun(iValue1,iValue2,iValue3);
	
	printf("%d",iRet);
	
	return 0;
}
	