#include<iostream>

using namespace std;

int main(void)
{
	int n;
	while(cin>>n)
	{
		if(n<0) 
		{
			n*=-1;
			n%=12;
			n=13-n;
			n%=12;
		}
		else
		{
			n%=12;
		}
		switch(n)
		{
			case 1:
				cout<<"��";
				break;
			case 2:
				cout<<"��";
				break;
			case 3:
				cout<<"��";
				break;
			case 4:
				cout<<"��";
				break;
			case 5:
				cout<<"�s";
				break;
			case 6:
				cout<<"�D";
				break;
			case 7:
				cout<<"��";
				break;
			case 8:
				cout<<"��";
				break;
			case 9:
				cout<<"�U";
				break;
			case 10:
				cout<<"��";
				break;
			case 11:
				cout<<"��";
				break;		
			case 0:
				cout<<"��";
				break;							
		}
		cout<<endl;
	}
	return 0;
}
