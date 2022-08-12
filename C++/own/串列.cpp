#include<iostream>

using namespace std;

class link
{
	public:
		int data;
		link *next;
};

void print(link *c)
{
	while(c!=0)
	{
		cout<<c->data <<" ";
		c=c->next;
	}
}
void insert(link *c,int num)
{
	link *node=new link;
	while(c->data<num)
	{
		c=c->next;
	}
	node->next=c->next;
	c->next=node;
	node->data=num;
}

void clean(link *c)
{
	while(c->data!=0)
	{
		link *node=c;
		c=c->next;
		delete node;
		node=0;
	}
}

void del(link *c,int num)
{
	//bug
	while(c->data!=num)
	{
		c=c->next;
	}
	link *node=c;
	c=c->next->next;
	delete node;
	node=0;
}

int main(void)
{
	int n,num,m;
	
	link *c,*f;
	f=0;
	
	cout<<"��J�`�@���X�ӼƦr�G";
	cin>>n;
	cout<<"��J�Ʀr�G";
	
	for(int i=0;i<n;i++)
	{
		cin>>num;
		c=new link;
		c->data=num;
		c->next=f;
		f=c;
	}
	print(c);
	
	cout<<"��J�n���J���Ʀr�G";
	cin>>m;
	insert(c,m);
	print(c);
	cout<<"�R��������J1�A�_�h��J0�G";
	cin>>m;
	if(m==1)
	{
		clean(c);
	}
	else
	{
		cout<<"��J�n�R�����Ʀr�G";
		cin>>m;
		del(c,m);
		print(c);
	}
	
	
	return 0;
}

