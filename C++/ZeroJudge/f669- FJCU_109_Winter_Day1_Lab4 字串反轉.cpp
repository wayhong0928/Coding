#include<iostream>
#include<string>

using namespace std;

int main(void)
{
	string a;
	while(getline(cin,a))
	{
		for(int i=a.length()-1;i>=0;i--)
		{
			cout<<a[i];
		}
		cout<<endl;
	}
	return 0;
}
