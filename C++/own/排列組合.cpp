#include<iostream>

using namespace std;

void run(int a[],int n,int count)
{
	if(count==n)
	{
		//cout<<endl<<endl;  debug��
		for(int i=0;i<n;i++)
		{
			cout<<a[i]<<" ";
		}
		cout<<endl;
		//cout<<endl<<endl;     debug��
		return;
	}
	for(int i=n-1;i>count;i--)
	{
		swap(a[i],a[count]);	//�����洫��ӼƦr
		//cout<<i<<" "<<count<<".";  debug��
		run(a,n,count+1);
		swap(a[count],a[i]); 	//���^��
	}
}

int main(void)
{
	int n;
	while(cin>>n)
	{
		int a[n];
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		run(a,n,0);
	}
	return 0;
}

