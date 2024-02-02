#include<stdio.h>
#include<math.h>
#include<string.h>

int fact(int b)
{
    int factr=1,i;

    for(i=1;i<=b;i++)
    {
        factr=factr*i;
    }
    printf("%d",factr);
}


int main()
{
    int a=3,res;
    fact(a);
  
    return 0;
}
