#include<iostream>
using namespace std;

int even(int a)
{
    if(a/2 >0){cout<<a<<"is an odd number";}
    else{cout<<a<<"is an even number";}
}
int fact(int n)
{
    int factr=n;
    for (int i=1;i<n;i++)
    {
        factr=factr*i;
    if(i==(n-1))
    {cout<<factr;}}
}
int prime(int c)
{
    for (int i=0;i=c;i++)
    {
        
    }
}

int main()
{
    int b;
    cout<<"please enter a number"<<endl;
    cin>>b;
    fact(b);
}