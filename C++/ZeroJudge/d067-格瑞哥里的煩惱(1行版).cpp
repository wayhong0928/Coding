#include<iostream>

using namespace std;

int main(void)
{
	int y;
	while(cin>>y)
	{
		if(y%4==0 && y%100!=0 || y%400==0)
		{
			cout<<"a leap year"<<endl;
		}
		else
		{
			cout<<"a normal year"<<endl;
		}
	}
	return 0;
}
