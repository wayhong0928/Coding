#include<iostream>

using namespace std;

void f(int mm,int dd)
{
	if((mm == 1 && dd >= 21) || (mm == 2 && dd <= 19))
		cout<<"���~�y"<< endl;
	else if((mm == 2 && dd >= 20) || (mm == 3 && dd <= 20))
		cout<<"�����y"<< endl;
	else if((mm == 3 && dd >= 21) || (mm == 4 && dd <= 20))
		cout<<"�d�Ϯy"<< endl;
	else if((mm == 4 && dd >= 21) || (mm == 5 && dd <= 21))
		cout<<"�����y"<< endl;
	else if((mm == 5 && dd >= 22) || (mm == 6 && dd <= 21))
		cout<<"���l�y"<< endl;
	else if((mm == 6 && dd >= 22) || (mm == 7 && dd <= 22))
		cout<<"���ɮy"<< endl;
	else if((mm == 7 && dd >= 23) || (mm == 8 && dd <= 21))
		cout<<"��l�y"<< endl;
	else if((mm == 8 && dd >= 22) || (mm == 9 && dd <= 23))
		cout<<"�B�k�y"<< endl;
	else if((mm == 9 && dd >= 23) || (mm == 10 && dd <= 23))
		cout<<"�ѯ��y"<< endl;
	else if((mm == 10 && dd >= 24) || (mm == 11 && dd <= 22))
		cout<<"���Ȯy"<< endl;
	else if((mm == 11 && dd >= 23) || (mm == 12 && dd <= 22))
		cout<<"�g��y"<< endl;
	else
		cout<<"���~�y"<< endl;
}

int main(void)
{
	int mm,dd;
	char t;
	while(cin>>mm>>t>>dd)
	{
		f(mm,dd);
	}
	return 0;
}
