#include<iostream>

using namespace std;

int main(void)
{
	int n;
	while(cin>>n)
	{
		if(n==0)
		{
			break;
		}
		else
		{
			for(int i=1;i<n;i++)
			{
				if(i%7!=0)
				{
					cout<<i<<" ";
				}
			}
			cout<<endl;
		} 
	}
	return 0;
 } 
