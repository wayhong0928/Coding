#include<iostream>

using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	long long a,b,c,d,e;
	while(cin>>a>>b>>c)
	{
		d=a;
		e=c;
		while(d>10 && e>=2)
		{
			b++;
			d-=10;
			e-=2;
		}
		cout<<a<<" �ӻ氮�A"<<b<<" �����J�O�A"<<c<<" �ӳJ�|�C"<<endl;
	}
	return 0;
}
