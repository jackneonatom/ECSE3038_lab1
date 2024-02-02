#include<iostream>
using namespace std;
int factorial(int num)
{
    cout<<"Factorial of "<< num <<endhl;

    //base case
    if (num==1)
    {
        cout<<"base case achieved"<<endl;
    return 1;
    }
    return num*factorial(num-1);
}
int total(int x,int y)
{
    return x+y;
}

int main()

{
    factorial(3);
    int r=5*total(6,4);

 return 0;

}
