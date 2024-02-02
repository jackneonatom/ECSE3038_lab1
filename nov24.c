#include<stdio.h>

int operate(float x,float y, char op)
{
    int res;
    

    scanf("%c",&op);

    
    switch(op)
    {
        case '+':
         res=x+y; 
        printf(" \n%d + %d = %d\n",x,y,res);
        break;

        case '-':
        res=x-y; 
        printf(" \n%d - %d = %d\n",x,y,res);
        break;

        case '*':
        res=x*y; 
        printf(" \n%d * %d = %d\n",x,y,res);
        break;

        case '/':
        res=x/y; 
        printf(" \n%d / %d = %d\n",x,y,res);
        break;

        default:
        printf("no  operator\n");

    }
    return res; 
}


int main()
{
    float num1,num2,num3;
    char opr;

    printf("enter first number\n");
    scanf("%d",&num1);
    printf("enter the number you want to operate on from that number\n");
    scanf("%d",&num2);

    printf("enter the operator\n");
    scanf("%c",&opr);


    operate(num1,num2,opr);



   
}

