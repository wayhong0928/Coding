#include<iostream>

using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	long long a,b,c,s;
	while(cin>>a>>b>>c)
	{
		s=(a+b+c)/2;
		cout<<(s*(s-a)*(s-b)*(s-c))<<endl;
	}
	return 0;
}
