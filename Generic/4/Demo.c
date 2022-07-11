/*
Class of array
*/

#include<iostream>
using namespace.std;

class Array
{
	public:
	   int *arr;
	   int size;
	   
	Array(int length=10)
	{
		arr = new int[length];
		size=length;
	}
	
	~Array()
	{
		delete []arr;
	}
	
	void Accept()
	{
		cout<<"Enter the elements of array";
		for(int i=0;i<size;i++)
		{
			cin>>arr[i];
		}
	}
	
	void Display()
	{
		cout<<"The elements in array are";
		for(int i=0;i<size;i++)
		{
			cout<<arr[i]<<"\t";
		}
	}
};

int main()
{
	int iNo;
	cout<<"Enter the number";
	cin>>iNo;
	
	Array obj(iNo);
	
	obj.Accept();
	obj.Display();
	
	return 0;
}