#include<iostream>

using namespace std;

int main(void)
{
	int n;
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		for(int j=n-i;j>0;j--)
		{
			cout<<"_";
		}
		for(int k=0;k<i;k++)
		{
			cout<<"*";
		}
		cout<<endl;
	} 
	return 0;
}
