#include<iostream>

using namespace std;

int main(void)
{
	int n,sum;
	while(cin>>n)
	{
		for(int i=2;i<=n;i++)
		{
			sum=0;
			while(n%i==0)
			{		
				if(n%(i*i)==0)
				{
					do 
					{
						sum++;
						n/=i;
					}
					while(n%i==0);
					{
						cout<<i<<"^"<<sum;
					}
				}	
				else
				{
					n/=i;
					cout<<i;
				}
				if(n>1)
				{
					cout<<" * ";
				}
			}
		}
		cout<<endl;
	}
	return 0;
}
