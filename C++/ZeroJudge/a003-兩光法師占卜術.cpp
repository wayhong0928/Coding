#include<iostream>

using namespace std;

int main(void)
{
	int m,d,s;
	while(cin>>m>>d)
	{
		s=(m*2+d)%3;
		if (s == 0)
		{
			cout<<"���q";
		}
		else if(s==1)
		{
			cout<<"�N";
		}
		else if(s==2)
		{
			cout<<"�j�N";		
		}
	}
	return 0 ;
}

