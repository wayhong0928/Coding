#include<iostream>
#include<cstdlib>
#include<cstring>


using namespace std;

int main(void){
	int a;
	char b[100];
	cout<<"��J�r��";
	cin.getline(b,100);
	a=strlen(b);
	cout<<"���൲�G�G";
	for(int i=a-1;i>=0;i--){
	cout<<b[i];
	}	
	cout<<endl<<"�@��"<<a<<"�r";
	return 0;
}
